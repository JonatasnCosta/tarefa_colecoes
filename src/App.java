import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parte 1: Ordenar nomes em ordem alfabética
        System.out.println("Digite nomes separados por vírgula:");
        String nomesInput = scanner.nextLine();
        String[] nomesArray = nomesInput.split(",");
        Arrays.sort(nomesArray);
        
        System.out.println("Nomes ordenados alfabeticamente:");
        for (String nome : nomesArray) {
            System.out.println(nome.trim());
        }
        
        // Parte 2: Separar por gênero
        System.out.println("Digite nome-sexo separados por vírgula (Ex: João-M, Maria-F):");
        String entrada = scanner.nextLine();
        String[] pessoas = entrada.split(",");
        
        List<String> masculinos = new ArrayList<>();
        List<String> femininos = new ArrayList<>();
        
        for (String pessoa : pessoas) {
            String[] nomeSexo = pessoa.trim().split("-");
            if (nomeSexo.length == 2) {
                String nome = nomeSexo[0].trim();
                String sexo = nomeSexo[1].trim().toUpperCase();
                
                if (sexo.equals("M")) {
                    masculinos.add(nome);
                } else if (sexo.equals("F")) {
                    femininos.add(nome);
                } else {
                    System.out.println("Sexo inválido para " + nome);
                }
            } else {
                System.out.println("Entrada inválida: " + pessoa);
            }
        }
        
        System.out.println("\nGrupo Masculino:");
        for (String masculino : masculinos) {
            System.out.println(masculino);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String feminino : femininos) {
            System.out.println(feminino);
        }
        
        scanner.close();
    }
    }


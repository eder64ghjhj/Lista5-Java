package lista5;

import java.util.Scanner;

public class Exercicio06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número inteiro:");
	        int numero = scanner.nextInt();

	        // Verifica paridade
	        if (numero % 2 == 0) {
	            System.out.println("O número é PAR.");
	        } else {
	            System.out.println("O número é ÍMPAR.");
	        }

	        // Verifica sinal
	        if (numero > 0) {
	            System.out.println("O número é POSITIVO.");
	        } else if (numero < 0) {
	            System.out.println("O número é NEGATIVO.");
	        } else {
	            System.out.println("O número é ZERO.");
	        }

	        scanner.close();
	    }
}

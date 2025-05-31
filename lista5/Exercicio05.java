package lista5;

import java.util.Scanner;

public class Exercicio05 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a primeira nota:");
	        double nota1 = scanner.nextDouble();

	        System.out.println("Digite a segunda nota:");
	        double nota2 = scanner.nextDouble();

	        System.out.println("Digite a terceira nota:");
	        double nota3 = scanner.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3;
	        System.out.printf("Média: %.2f\n", media);

	        if (media >= 7.0) {
	            System.out.println("Classificação: Aprovado");
	        } else if (media >= 5.0) {
	            System.out.println("Classificação: Recuperação");
	        } else {
	            System.out.println("Classificação: Reprovado");
	        }

	        scanner.close();
	    }
}

package lista5;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		double divisao5 = numero % 5;
		double divisao3 = numero % 3;
		
		if (divisao5 == 0 && divisao3 == 0) {
			System.out.println("O múmero é divisível por 5 e por 3.");
		}
		else {
			System.out.println("Esse número não é divisível por 5 e por 3.");
		}
		
		sc.close();
	}
}

package exercicios_curso;

import java.util.Scanner;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int peca1, numPeca1;
		int peca2, numPeca2;
		double valorTotal, valorPeca1, valorPeca2;

		System.out.println("Qual o codigo da peca 1?");
		peca1 = sc.nextInt();
		System.out.println("Qual o numero de pecas 1?");
		numPeca1 = sc.nextInt();
		System.out.println("Qual o valor de cada peca 1?");
		valorPeca1 = sc.nextDouble();

		System.out.println("Qual o codigo da peca 2?");
		peca2 = sc.nextInt();
		System.out.println("Qual o numero de pecas 2?");
		numPeca2 = sc.nextInt();
		System.out.println("Qual o valor de cada peca 2?");
		valorPeca2 = sc.nextDouble();

		valorTotal = numPeca1 * valorPeca1 + numPeca2 * valorPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

		sc.close();

	}

}

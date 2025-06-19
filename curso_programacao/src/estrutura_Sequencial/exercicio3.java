package estrutura_Sequencial;

import java.util.Scanner;

/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		int DIFERENCA;
		
		System.out.println("Escreva um valor inteiro para A: ");
		A = sc.nextInt();
		System.out.println("Escreva um valor inteiro para B: ");
		B = sc.nextInt();
		System.out.println("Escreva um valor inteiro para C: ");
		C = sc.nextInt();
		System.out.println("Escreva um valor inteiro para D: ");
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}

}

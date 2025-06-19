package exercicios_curso;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		System.out.println("Escreva um numero inteiro: ");
		x = sc.nextInt();
		System.out.println("Escreva outro numero inteiro: ");
		y = sc.nextInt();
		
		soma = x+y;
		
		System.out.println("SOMA = " + soma);

		sc.close();
	}

}

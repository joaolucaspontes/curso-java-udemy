package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros quer digitar?");
		int n = sc.nextInt();

		int[] vect = new int[n];

		double sum = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("SOMA = " + sum);
		System.out.printf("MEDIA = %.2f", avg);
		
		sc.close();
	}

}

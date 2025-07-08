package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros quer digitar?");
		int n = sc.nextInt();
		
		int [] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i=0; i<n; i++) {
			if (vect[i] <0) {
				System.out.printf("%d%n", vect[i]);
			}
		}
		
		sc.close();
	}

}

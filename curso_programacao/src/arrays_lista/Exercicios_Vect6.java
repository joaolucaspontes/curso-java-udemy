package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int[] vect2 = new int[n];
		int[] vect3 = new int[n];
		
	
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite os valores do vetor A: ");
			 vect[i] = sc.nextInt();
			 
		}
		
		System.out.println(" ");
		
		for (int i=0; i<vect2.length; i++) {
			System.out.print("Digite os valores do vetor B: ");
			 vect2[i] = sc.nextInt();
			
		}
		
		
		System.out.println("\nVETOR RESULTANTE: ");
		for (int i=0; i<vect3.length; i++) {
			vect3[i] = vect[i] + vect2[i];
			System.out.printf("%d ", vect3[i]);
		}
		
	
		
		sc.close();
	}

}

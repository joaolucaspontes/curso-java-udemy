package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double avg = 0;
		double sum = 0;

		
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();

		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		avg = sum / n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f", avg);
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i] < avg) {
				System.out.printf("%.1f\n",vect[i]);
			}
		}
		
		
		sc.close();
	}

}

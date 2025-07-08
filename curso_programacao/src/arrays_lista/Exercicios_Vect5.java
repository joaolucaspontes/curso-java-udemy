package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double maiorValor = 0.0;
		int posMaior = 0;
		
		System.out.println("Quantas pessoas serao cadastradas?");
		int n = sc.nextInt();

		double[] vect = new double[n];
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			 vect[i] = sc.nextInt();
		}
		
		for (int i=1; i<vect.length; i++) {
	        if (vect[i] > maiorValor) {
	            maiorValor = vect[i];
	            posMaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);
		
		sc.close();
	}

}

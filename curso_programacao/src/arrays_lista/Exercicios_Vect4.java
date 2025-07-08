package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao cadastradas?");
		int n = sc.nextInt();
		
		 int[] vect = new int[n];
		 
		 int pares = 0;
		 
		 for (int i=0; i<vect.length;i++) {
			 System.out.print("Digite um numero: ");
			 vect[i] = sc.nextInt();
		 }
		 
		 System.out.print("NUMEROS PARES: ");
		 
		 for(int i=0; i<vect.length; i++) {
			 if (vect[i] % 2 == 0) {
				 System.out.printf("%d ", vect[i]);
				 pares++;
			 }
		 }
		 
		 System.out.printf("\nQUANTIDADE DE PARES = %d", pares);
		
		 
		 
		sc.close();
	}

}

package arrays_lista;

import java.util.Scanner;

public class Exercicios_Vect3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao cadastradas?");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		double alturaMedia = 0.0;
		double somaAltura = 0.0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			
			System.out.println("Nome: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
			somaAltura += altura[i];
		}
		
		
		alturaMedia = somaAltura / n;
		
		System.out.printf("Altura media: %.2f\n", alturaMedia);
		
		double menorQue = 0;
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				menorQue++;
			}
		}
		
		double percentualMenores = (menorQue / n) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", percentualMenores);
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16) {
				System.out.printf("%s\n", name[i]);
			}
		}
		
		sc.close();
	}

}

package estrutura_Condicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o ponto no eixo X e Y");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x>0 && y>0) {
			System.out.println("Q1");
		} else if (x<0 && y>0) {
			System.out.println("Q2");
		} else if (x<0 && y<0) {
			System.out.println("Q3");
		} else if (x>0 && y<0) {
			System.out.println("Q4");
		} else if (x==0 && y!= 0) {
			System.out.println("Eixo X");
		} else if (y==0 && x!=0) {
			System.out.println("Eixo Y");
		} else if (x==0 && y==0) {
			System.out.println("Origem");
		}
		
		sc.close();

	}

}

package estrutura_Condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro:");
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Numero Negativo");
		} else if (num > 0) {
			System.out.println("Numero Positivo");
		} else {
			System.out.println("Zero");
		}
				
		
		sc.close();

	}

}

package estrutura_Condicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double total;

		System.out.println("Escreva o codigo e a quantidade do produto");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4.00;
			System.out.println("Total: R$" + total);
		} else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.println("Total: R$" + total);
		} else if (codigo == 3) {
			total = quantidade * 5.00;
			System.out.println("Total: R$" + total);
		} else if (codigo == 4) {
			total = quantidade * 2.00;
			System.out.println("Total: R$" + total);
		} else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.println("Total: R$" + total);
		} else {
			System.out.println("Codigo inválido!");
		}

		sc.close();

	}

}

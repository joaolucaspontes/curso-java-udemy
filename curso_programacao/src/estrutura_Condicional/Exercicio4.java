package estrutura_Condicional;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial e final do jogo: ");

		int hora1 = sc.nextInt();
		int hora2 = sc.nextInt();
		
		int duracao;
		
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}
		else {
			duracao = 24 - hora1 + hora2;
		}
		
		System.out.println("O jogo durou " + duracao + " horas");
		

		sc.close();
	}

}

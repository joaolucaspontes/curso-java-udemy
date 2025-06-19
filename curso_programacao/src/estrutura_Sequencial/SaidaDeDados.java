package estrutura_Sequencial;

import java.util.Locale;



public class SaidaDeDados {

	public static void main(String[] args) {
		
		String nome = "Mariana";
		int idade = 27;
		double x = 20.1245;
		
		System.out.println("Hello World");
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		//%f = ponto flutuante
		//%d = numero inteiro
		//%s = texto
		//%n = quebra de linha
		
		System.out.printf("Nome: %s %n", nome);
		System.out.printf("Idade: %d %n", idade);
		System.out.printf("Dinheiro: %f %n", x);
		System.out.printf("%s tem %d anos e ganha %.3f por mes", nome, idade, x);
		
		
		
		
	}

}

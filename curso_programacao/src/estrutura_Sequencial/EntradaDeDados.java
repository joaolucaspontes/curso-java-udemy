package estrutura_Sequencial;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// String x;
		// x = sc.next();

		// int x;
		// x = sc.nextInt();

		// double x;
		// x = sc.nextDouble();

		// char x; (para ler o primeiro caracter da palavra)
		// x = sc.next().charAt(0);

		/* String x;
		int y;
		double z;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();

		System.out.println("Voce digitou:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		/* int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); //comando para limpar o buffer e não consumir um nextline()
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		int x;
		
		String s1, s2, s3;
		
		System.out.println("Qual o seu nome?");
		s1 = sc.nextLine();
		System.out.println("Quantos anos voce tem?");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("Qual nome da sua mae?");
		s2 = sc.nextLine();
		System.out.println("Qual o nome do seu pai?");
		s3 = sc.nextLine();
		
		System.out.println("\nNome: " + s1);
		System.out.println("Idade: "+ x);
		System.out.println("Nome da mae: " + s2);
		System.out.println("Nome do pai: " + s3);
		
		

		sc.close();

	}

}

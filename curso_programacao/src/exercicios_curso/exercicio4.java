package exercicios_curso;

import java.util.Scanner;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double salario, valorHora;
		
		System.out.println("Qual seu numero de funcionario?");
		numero = sc.nextInt();
		System.out.println("Quantas horas trabalhadas?");
		horas = sc.nextInt();
		System.out.println("Quanto recebe por hora?");
		valorHora = sc.nextDouble();
		
		salario = horas*valorHora;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", numero, salario);
		
		sc.close();

	}

}

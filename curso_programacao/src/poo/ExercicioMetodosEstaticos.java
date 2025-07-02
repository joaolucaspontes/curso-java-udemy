package poo;

import java.util.Scanner;

public class ExercicioMetodosEstaticos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dollar price?");
		double dPrice = sc.nextDouble();
		
		System.out.println("how many dollars will be bought?");
		double dAmount = sc.nextDouble();
		
		double dolCalculator = CurrencyConverter.calculator(dPrice, dAmount);
		
		System.out.println("Amount to be paid in reais = " + dolCalculator);
		
		sc.close();
	}

}

package poo;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		Account account = new Account(name, number);
		
		System.out.println("Is there na initial deposit? (y/n)");
		char initialDep = sc.next().charAt(0);

		if (initialDep == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account.setBalance(initialValue);
		}
		
		System.out.println("\nEnter a deposit value: ");
		double deposit = sc.nextDouble();
		account.dpMoney(deposit);
		
		System.out.println(account.toString());
		
		System.out.println("\nEnter a whitdraw value: ");
		double whitdraw = sc.nextDouble();
		account.wdMoney(whitdraw);
		
		System.out.println(account.toString());
	
		sc.close();
	}

}

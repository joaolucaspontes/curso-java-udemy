package exercicio_Abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data");
			System.out.print("Individual or company? (i/c)? ");
			sc.nextLine();
			char ic = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (ic == 'i') {
				System.out.println("Health expenditures: ");
				double health = sc.nextDouble();
				
				Contribuintes contribuintes = new PessoaFisica(name, income, health);
				
				list.add(contribuintes);
			} else if (ic == 'c') {
				System.out.println("Number of employees: ");
				int employees = sc.nextInt();
				
				Contribuintes contribuintes = new PessoaJuridica(name, income, employees);
				
				list.add(contribuintes);		
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		for (Contribuintes cont : list) {
			System.out.println(cont);
		}
		
		double sum = 0.0;
		
		for (Contribuintes cont : list) {
			sum += cont.imposto();
		}
		
		System.out.println("\nTOTAL TAXES: $ "+ String.format("%.2f", sum));
		
		sc.close();
	}

}

package poo;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee empl = new Employee();
		
		System.out.println("Name?");
		empl.name = sc.nextLine();
		
		System.out.println("Gross Salary?");
		empl.grossSalary = sc.nextDouble();
		
		System.out.println("Tax?");
		empl.tax = sc.nextDouble();
		
		
		System.out.println("Employee: " + empl.name + ", $ " + empl.netSalary());
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);
		
		
		System.out.println(empl.toString());
		
	
		sc.close();
	}

}

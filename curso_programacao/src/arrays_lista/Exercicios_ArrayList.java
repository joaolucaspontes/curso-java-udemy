package arrays_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> list = new ArrayList<>();
		
		
		System.out.println("Quantos funcionarios serão registrado?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Funcionario" + " #" +(i+1)+":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(id, name, salario);
			
			list.add(func);
			
		}
		
		
		
		
		
		sc.close();
	}

}

package exercicio_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		
		Set<Aluno> setA = new HashSet<>();
		
		for (int i=0; i<a; i++) {
			int codigoA = sc.nextInt();
			setA.add(new Aluno(codigoA));
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		
		Set<Aluno> setB = new HashSet<>();
		
		for (int i=0; i<b; i++) {
			int codigoB = sc.nextInt();
			setB.add(new Aluno(codigoB));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		
		Set<Aluno> setC = new HashSet<>();
		
		for (int i=0; i<c; i++) {
			int codigoC = sc.nextInt();
			setC.add(new Aluno(codigoC));
		}
		
		Set<Aluno> total = new HashSet<>();
		total.addAll(setA);
		total.addAll(setB);
		total.addAll(setC);
		
		
		System.out.println("Total students: " + total.size());
		
		
		
		
		sc.close();
	}

}

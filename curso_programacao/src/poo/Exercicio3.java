package poo;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		
		System.out.println("Name: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Scores: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		
		aluno.score();
		
		if (aluno.sum >= 60) {
			System.out.println("FINAL GRADE = " + aluno.sum);
			System.out.println("PASS");
		} else {
			double missing = 60 - aluno.sum;
			System.out.println("FINAL GRADE = " + aluno.sum);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", missing);
		}
	
		sc.close();
	}

}

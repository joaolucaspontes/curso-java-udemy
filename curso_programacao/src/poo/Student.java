package poo;

public class Student {

	public String name;
	public double nota1, nota2, nota3, sum;
	
	public double score() {
	    sum = nota1 + nota2 + nota3;
		return sum;
		
	}
}

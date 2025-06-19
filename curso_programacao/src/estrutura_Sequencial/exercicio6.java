package estrutura_Sequencial;

import java.util.Scanner;

/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double areaTriangulo, areaCirculo, areaTrapezio, areaRetangulo, areaQuadrado;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		areaTriangulo = A * C /2;
		areaCirculo = 3.14159 * C * C;
		areaTrapezio = ((A+B)*C)/2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", areaTriangulo, 
				areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		

		
		sc.close();

	}

}

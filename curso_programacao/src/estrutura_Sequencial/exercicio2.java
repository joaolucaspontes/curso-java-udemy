package estrutura_Sequencial;

/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio, area;
		double pi = 3.14159;

		System.out.println("Qual o valor do raio do circulo?");
		raio = sc.nextDouble();
		raio = Math.pow(raio, 2);
		area = pi*raio;
		System.out.printf("AREA = %.4f%n", area);

		sc.close();
	}

}

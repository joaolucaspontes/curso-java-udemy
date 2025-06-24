package estrutura_Repetitivas;

import java.util.Scanner;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o combustivel abastecido:\n1-Alcool\n2-Gasolina\n3-Diesel");
		
		int alcool = 0, gas = 0, diesel = 0;
		
		int x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alcool +=1;
			} else if (x == 2) {
				gas +=1;
			} else if (x == 3) {
				diesel +=1;
			}
				
			x = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!\n"+"\nAlcool: "+alcool+"\nGasolina: "+gas+"\nDiesel: " + diesel);
		
		sc.close();

	}

}

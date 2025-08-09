package exercicio_heranca_poli;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Product> productList = new ArrayList<>();

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char cui = sc.next().charAt(0);

			if (cui == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();

				Product product = new Product(productName, productPrice);

				productList.add(product);
			} else if (cui == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				LocalDate dateManu = LocalDate.parse(date, fmt);

				Product usedproduct = new UsedProduct(productName, productPrice, dateManu);
				productList.add(usedproduct);

			} else if (cui == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String productName = sc.nextLine();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();

				Product importedproduct = new ImportedProduct(productName, productPrice, customsFee);
				productList.add(importedproduct);

			}
		}

		System.out.println("\nPRICE TAGS");

		for (Product pd : productList) {
			System.out.println(pd.priceTag());
		}

		sc.close();
	}

}

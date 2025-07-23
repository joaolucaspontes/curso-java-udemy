package exercicio_Enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime instante = LocalDateTime.now();
		
		System.out.println("Enter cliente data:");
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		String date2 = sc.nextLine();
		LocalDate date = LocalDate.parse(date2, formatter);
		
		System.out.println("Enter order data:");
		System.out.println("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(instante, OrderStatus.valueOf(status), new Client(name, email, date));
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter #"+ (i + 1) +" item data: ");
			sc.nextLine();
			System.out.println("Product name: ");
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
	
		}
		
		
		
		System.out.println("ORDER SUMARY: ");
		System.out.println("Order Moment: " + instante.format(formatter2));
		System.out.println("ORDER STATUS: " + OrderStatus.valueOf(status));
		System.out.println("Client: " + name +" ("+date2+") "+"-"+" "+email);
		System.out.println("\nOrder Items: ");
		for (OrderItem item1 : order.getItems()) {
			System.out.println(item1);
			
		}
		
		System.out.println("Total price: $" + order.total());
		
		
		
		
		
		sc.close();
	}

}

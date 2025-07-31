package exercicio_Enums;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	// associacoes
	private List<OrderItem> items = new ArrayList<>();
	private Client client;

	
	public Order () {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	
	
}

package it.synclab.pizzalab.OrderService;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {

	@Id
	private String id;
	private String client;
	private Address address;
	private String delivery;
	private double total;
	private boolean delivered;
	private List<OrderItem> orderItems;

	public Order(String id, String client, Address address, String delivery, double total, boolean delivered,
			List<OrderItem> orderItems) {
		super();
		this.id = id;
		this.client = client;
		this.address = address;
		this.delivery = delivery;
		this.total = total;
		this.delivered = delivered;
		this.orderItems = orderItems;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getId() {
		return id;
	}

}

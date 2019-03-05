package it.synclab.pizzalab.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrders() {
		return this.orderRepository.findAll();
	}

	public void addOrder(Order order) {
		this.orderRepository.save(order);
	}

	public void updateOrder(Order order) {
		this.orderRepository.save(order);
	}

	public List<Order> getDeliveredOrders() {
		return this.orderRepository.findByDeliveredTrue();
	}

	public List<Order> getOrdersToDeliver() {
		return this.orderRepository.findByDeliveredFalse();
	}
}

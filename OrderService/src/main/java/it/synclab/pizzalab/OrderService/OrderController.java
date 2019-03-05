package it.synclab.pizzalab.OrderService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/orders")
	public List<Order> getOrders(@RequestParam Optional<Boolean> delivered) {
		if (delivered.isPresent()) {
			if (delivered.get())
				return this.orderService.getDeliveredOrders();

			return this.orderService.getOrdersToDeliver();
		}
		return this.orderService.getAllOrders();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/orders")
	public void addOrder(@RequestBody Order order) {
		this.orderService.addOrder(order);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/orders/{id}")
	public void updateOrder(@RequestBody Order order) {
		this.orderService.updateOrder(order);
	}

}

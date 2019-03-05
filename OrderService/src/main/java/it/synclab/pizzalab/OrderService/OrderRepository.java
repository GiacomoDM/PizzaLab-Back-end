package it.synclab.pizzalab.OrderService;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>  {
	public List<Order> findByDeliveredFalse();
	
	public List<Order> findByDeliveredTrue();
}

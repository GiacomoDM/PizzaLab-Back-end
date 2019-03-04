package it.synclab.pizzalab.ProductService;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
	
	public List<Product> getProductsByCategoryId(String categoryId);

}

package it.synclab.pizzalab.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

	public void addProduct(Product product) {
		this.productRepository.save(product);
	}

	public List<Product> getProductsByCategory(String categoryId) {
		return this.productRepository.getProductsByCategoryId(categoryId);
	}

	public void deleteProduct(String id) {
		this.productRepository.deleteById(id);		
	}

}

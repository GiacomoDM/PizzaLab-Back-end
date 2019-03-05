package it.synclab.pizzalab.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	
	@RequestMapping("/categories/{categoryId}/products")
	public List<Product> getProductsByCategory(@PathVariable String categoryId) {
		return this.productService.getProductsByCategory(categoryId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProduct(@RequestBody Product product) {
		this.productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
	public void deleteProduct(@PathVariable String id) {
		this.productService.deleteProduct(id);
	}

}

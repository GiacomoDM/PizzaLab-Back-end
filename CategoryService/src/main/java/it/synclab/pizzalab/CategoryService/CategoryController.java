package it.synclab.pizzalab.CategoryService;

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
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categories")
	public List<Category> getAllProducts() {
		return this.categoryService.getAllCategories();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/categories")
	public void addCategory(@RequestBody Category category) {
		this.categoryService.addCategory(category);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/categories/{id}")
	public void deleteProduct(@PathVariable String id) {
		this.categoryService.deleteCategory(id);
	}

}

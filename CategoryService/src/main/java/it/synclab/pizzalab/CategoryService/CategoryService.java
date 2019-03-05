package it.synclab.pizzalab.CategoryService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired 
	private CategoryRepository categoryRepository;
	
	public List<Category> getAllCategories() {
		return this.categoryRepository.findAll();
	}

	public void addCategory(Category category) {
		this.categoryRepository.save(category);
	}

	public void deleteCategory(String id) {
		this.categoryRepository.deleteById(id);		
	}
}

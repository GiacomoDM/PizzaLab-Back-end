package it.synclab.pizzalab.ProductService;

public class Product {
	private long id;
	private String name;
	private double price;
	private long categoryId;	
	
	public Product() { }
	
	public Product(long id, String name, double price, long categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public long getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	public long getId() {
		return id;
	}
	
	
}

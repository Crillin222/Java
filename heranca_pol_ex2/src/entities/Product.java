package entities;

public class Product {
	
	//ATRIBUTES
	private String name;
	private double price;
	
	//CONSTRUCTORS
	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	//GETTERS E SETTERS
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
	
	//METHODS
	public String priceTag() {
		return name
					+ " $ "
					+ String.format("%.2f", price);
	}
	
	
	

}

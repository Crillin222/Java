package entities;

import entities.enums.Color;
//EXTENDED CLASS FROM ABSTRACT CLASS
public class Rectangle extends Shape {

	//ATRIBUTES
	private Double height;
	private Double width;
	
	//CONSTRUCTORS
	public Rectangle() {
		super();
	}
	
	//GETTERS E SETTERS
	public Rectangle(Color color, Double height, Double width) {
		super(color);
		this.height = height;
		this.width = width;
	}



	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	//METHOD
	@Override
	public double area() {
		return width * height;
	}

}

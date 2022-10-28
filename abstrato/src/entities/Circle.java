package entities;

import entities.enums.Color;
//EXTENDED CLASS FROM ABSTRACT CLASS
public class Circle extends Shape{

	private Double radius;
	
	//CONSTRUCTORS
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	//GETTERS E SETTERS
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	//METHOD
	@Override
	public double area() {
		return Math.PI * radius * radius; 
	}

}

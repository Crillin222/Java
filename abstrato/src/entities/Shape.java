package entities;

import entities.enums.Color;

//ABSTRACT CLASS
public abstract class Shape {
	
	//ATRIBUTE IMPORTED FROM ENUM COLOR
	private Color color;
	
	//CONSTRUCTORS
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	//GETTERS E SETTERS
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	//ABSTRACT METHOD
	public abstract double area();

}

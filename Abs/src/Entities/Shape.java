package Entities;

import Entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	//constructors
	public Shape() {}

	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	//getter and setters
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();

}

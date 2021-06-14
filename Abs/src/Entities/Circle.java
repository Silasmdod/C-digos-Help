package Entities;

import Entities.enums.Color;

public class Circle extends Shape {
	
	private double radius;
	
	//constructor
	public Circle() {}
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	//getter and setters

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//métodos
	
	@Override
	public double area() {
		return Math.PI* radius * radius;
	}

}

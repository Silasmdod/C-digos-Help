package Entities;

import Entities.enums.Color;

public class Rectangle extends Shape {
	
	
	private double base;
	private double altura;

	//constructors
	public Rectangle() {
		super();
	}
	
	
	public Rectangle(Color color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	//getter and setter
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//métodos
	
	@Override
	public double area() {
		return base * altura;
	}

}

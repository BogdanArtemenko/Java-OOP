package com;

public class Circle extends Shape {
	
	private double radius;
	private Point center;
	private final double pi = 3.141592654;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
	@Override
	double getPerimeter() {
		return 2 * pi * radius;
	}

	@Override
	double getArea() {
		return pi*Math.pow(radius, 2);
	}

}

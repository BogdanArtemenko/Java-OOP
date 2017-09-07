package com;

public class Square extends Shape {
	
	private double a;
	private Point center;
	private Point corner;
	
	public Square(double a) {
		super();
		this.a = a;
	}
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}	
	public Point getCorner() {
		return corner;
	}
	public void setCorner(Point corner) {
		this.corner = corner;
	}
	
	@Override
	public String toString() {
		return "Square [a=" + a + ", center=" + center + ", corner=" + corner
				+ "]";
	}
	
	@Override
	double getPerimeter() {
		return a * 4;
	}

	@Override
	double getArea() {
		return a * a;
	}

}

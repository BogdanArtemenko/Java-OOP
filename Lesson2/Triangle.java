package com;

public class Triangle extends Shape {
	
	private double a;
	private double b;
	private double c;
	private Point [] vertexes = new Point[3];
	
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Point[] getVertexes() {
		return vertexes;
	}
	public void setVertexes(Point[] vertexes) {
		this.vertexes = vertexes;
	}
		
	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	@Override
	double getPerimeter() {
		return a + b + c;
	}

	@Override
	double getArea() {
		double polP = (a + b + c) / 2;
		return Math.sqrt(polP * (polP - a) * (polP - b) * (polP - c));
	}
}

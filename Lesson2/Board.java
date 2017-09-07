package com;

public class Board {

	private String title;
	private Shape [] shapeArray = new Shape[4];
	
	public Board(String title) {
		super();
		this.title = title;
	}
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addShape(Shape shape, int part) {
		int i = part -1; 
			if(shapeArray[i] == null) {
				shapeArray[i] = shape;
				System.out.println("Shape added to the part " + part);
				return;
			} 
			System.out.println("ERROR: part " + part + " is occupied");		
	}
	
	public void removeShape(int part) {
		int i = part -1; 
		shapeArray[i] = null;
		System.out.println("Part " + part + " cleaned");		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double sumArea = 0;
		sb.append("Desk - " + title);
		sb.append(System.lineSeparator());
		for (int i = 0; i < shapeArray.length; i++) {
			if(shapeArray[i] != null) {
				sb.append("part " + (i+1) + " - " + shapeArray[i]);
				sumArea = sumArea + shapeArray[i].getArea();
			} else {
				sb.append("part " + (i+1) + " - empty");
			}
			sb.append(System.lineSeparator());
		}
		sb.append("Total area: " + sumArea);
		return sb.toString();
		
	}
	
}

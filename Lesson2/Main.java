package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create point, shapes and desk
		Point pointOne = new Point(1,2);
		Circle circleOne = new Circle(100500);
		Square squareOne = new Square(1);
		Triangle triangleOne = new Triangle(3,4,5);
		Board boardOne = new Board("BEST SHAPES IN THE WORLD");
		
		//define points for some shapes
		circleOne.setCenter(pointOne);
		squareOne.setCenter(pointOne);
		
		//add shapes to the board
		boardOne.addShape(circleOne, 2);
		boardOne.addShape(triangleOne, 3);
		boardOne.addShape(squareOne, 4);
		//try to add again to the same part
		boardOne.addShape(triangleOne, 3);
		
		//check the board
		System.out.println();
		System.out.println(boardOne);
		System.out.println();
		
		//remove one shape
		boardOne.removeShape(2);
		
		//check the board
		System.out.println();
		System.out.println(boardOne);
		
	}
}

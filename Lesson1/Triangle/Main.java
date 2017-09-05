package com;

public class Main {

	public static void main(String[] args){
		
		Triangle triOne = new Triangle(2,3,4);
		Triangle triTwo = new Triangle(10,10,10);
		Triangle triThree = new Triangle(2,2,10);
		
		System.out.println("S = " + triOne.squarecount());
		System.out.println("S = " + triTwo.squarecount());
		System.out.println("S = " + triThree.squarecount());
	}
}

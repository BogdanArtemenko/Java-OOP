package com;

public class Main {

	public static void main(String[] args){
		
		Cat catOne = new Cat("Vasya","Red",2010,7,false);
		Cat catTwo= new Cat("Tosha","Black",2015,5.5,false);
		
		catOne.meow();
		catOne.print();
		System.out.println();
		catOne.sterilize();
		catOne.print();
		System.out.println();
		
		catTwo.meow();
		catTwo.print();
	}
}

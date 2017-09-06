package com;

public class Main {

	public static void main(String[] args){
		
		//create 3 phones and one network
		Phone phoneOne = new Phone("0501111111");
		Phone phoneTwo = new Phone("0502222222");
		Phone phoneThree = new Phone("0503333333");
		Network netOne = new Network("Vodafone","050");
		
		//check created objects
		System.out.println(phoneOne);
		System.out.println(phoneTwo);
		System.out.println(netOne);
		System.out.println();
		
		//register 2 phones in the network
		phoneOne.register(netOne);
		phoneTwo.register(netOne);
		
		//check registration
		System.out.println(phoneOne);
		System.out.println(phoneTwo);
		System.out.println(netOne);
		System.out.println();
		
		//check right call
		phoneOne.call(phoneTwo.getNumber());
		System.out.println();
		
		//check wrong call
		phoneOne.call(phoneThree.getNumber());
		System.out.println();
		
	}
}

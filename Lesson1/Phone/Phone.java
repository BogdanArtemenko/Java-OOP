package com;

import java.util.Arrays;

public class Phone {
	private String number;
	private String color;
	private String osystem;
	private int year;
	private Network operator;
	

	public Phone(String number) {
		super();
		this.number = number;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getNumber() {
		return number;
	}
	public Network getOperator() {
		return operator;
	}

	public String toString() {
		return "Phone [number=" + number + ", color=" + color + ", osystem="
				+ osystem + ", year=" + year + ", operator=" + operator + "]";
	}
	
	//method for registration phone in the network
	public void register(Network network) {
		this.operator = network;
		network.addNumber(this.number);
	}
	
	//method for making call within the owner network
	public void call(String number) {
		if  (Arrays.asList(this.operator.getNumbers()).contains(number)){
			System.out.println("Successful call to " + number);
		}else{System.out.println("Number " + number + " not registered in the network");}
	}		
}

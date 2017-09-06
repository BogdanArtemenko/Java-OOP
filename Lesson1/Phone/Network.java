package com;

import java.util.Arrays;

public class Network {
	private String name;
	private String code;
	private String numbers[] = new String[100];
	
	public Network(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public Network() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Network [name=" + name + ", code=" + code + ", numbers="
				+ (numbers != null ? Arrays.asList(numbers) : null) + "]";
	}

	public String[] getNumbers() {
		return numbers;
	}

	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}	
	
  //method for adding Phone number to the network list
	public void addNumber(String number) {
		for(int i = 0; i < 100; i++){
			if (this.numbers[i] == null) {
					this.numbers[i] = number;
					break;
			}else{
				System.out.println(this.name + " network is overcrowded");
			}
		}
	}	
}

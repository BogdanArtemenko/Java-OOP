package com;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new NewThread(i), String.valueOf(i));
		}	
	}

}

package com;

public class NewThread implements Runnable {
	private double num;
	private Thread thr;

	public NewThread(double num) {
		super();
		this.num = num;
		thr = new Thread(this);
		thr.start();
	}

	@Override
	public void run() {
		System.out.println("Factorial for " + num + " = " + factorial(num));
	}

	public static double factorial(double n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}

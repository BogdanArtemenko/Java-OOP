package com;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[200000];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(100);
		}
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		
		long tstart = System.currentTimeMillis();
		sum(array);
		long tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + "- Static method sum");
		tstart = System.currentTimeMillis();
		MultiThreadSum.sum(array2, 3);
		tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - MultiThread sum");
		tstart = System.currentTimeMillis();
		int sum = IntStream.of(array3).sum();
		System.out.println(sum);
		tend = System.currentTimeMillis();
		System.out.println((tend - tstart) + " ms" + " - IntStream sum");
	}

	static void sum(int[] array) {
		int sum = 0;
		for (int e : array) sum += e;	
		System.out.println(sum);
	}

}

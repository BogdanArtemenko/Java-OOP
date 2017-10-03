package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<Integer> listOne = new ArrayList<>();
		Random rn = new Random();
		for (int i = 1; i < 10; i++) {
			listOne.add(rn.nextInt(100));
		}
		System.out.println(listOne);

		listOne.remove(0);
		listOne.remove(0);
		listOne.remove(listOne.size() - 1);

		System.out.println(listOne);
	}

}

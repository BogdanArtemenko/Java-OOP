package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> kolejka = new ArrayList<String>();
		kolejka.add("Sheldon");
		kolejka.add("Leonard");
		kolejka.add("Volovitc");
		kolejka.add("Kutrapalli");
		kolejka.add("Penny");

		int colas = Integer.parseInt(JOptionPane.showInputDialog("Please input colas amount"));

		for (int i = 0; i < colas; i++) {
			kolejka.add(kolejka.get(0));
			kolejka.add(kolejka.get(0));
			kolejka.remove(0);
		}

		System.out.println(kolejka);

	}

}

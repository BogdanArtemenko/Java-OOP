package com;

public class Cat {
	private String name;
	private String color;
	private int birthyear;
	private double weight;
	private boolean sterilization;
	
	
	public Cat(String name, String color, int birthYear, double weight,
			boolean sterilization) {
		super();
		this.name = name;
		this.color = color;
		this.birthyear = birthYear;
		this.weight = weight;
		this.sterilization = sterilization;
	}
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBirthYear() {
		return birthyear;
	}

	public void setBirthYear(int birthYear) {
		this.birthyear = birthYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isSterilization() {
		return sterilization;
	}

	public void setSterilization(boolean sterilization) {
		this.sterilization = sterilization;
	}

	
	public void meow() {
		System.out.println("MEEEOW!!!");
	}

	public void stealfood(String food) {
		System.out.println(food + " stolen! yummy-yummy");
	}
	
	public void sterilize() {
		sterilization = true;
	}
	

	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Cat birth year: " + birthyear);
		System.out.println("Weight: " + weight);
		System.out.println("Cat sterilized: " + sterilization);
	}
	
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", birthYear="
				+ birthyear + ", weight=" + weight + ", sterilization="
				+ sterilization + "]";
	}	
}

package com;

public class Human {

	private String name;
	private int age;
	private String sex;

	public Human(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", sex=" + sex;
	}

}

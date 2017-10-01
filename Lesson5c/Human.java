package com;

public class Human {

	private String name;
	private String surname;
	private int age;
	private String sex;

	public Human(String name, String surname, int age, String sex) {
		super();
		this.name = name;
		this.surname = surname;
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

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return name + ", " + surname + ", " + age + ", " + sex;
	}

}

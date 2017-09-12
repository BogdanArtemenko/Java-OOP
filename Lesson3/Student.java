package com;

public class Student extends Human {

	private String univer;
	private String group;

	public Student(String name, int age, String sex, String univer) {
		super(name, age, sex);
		this.univer = univer;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUniver() {
		return univer;
	}

	public void setUniver(String univer) {
		this.univer = univer;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + " univer=" + univer
				+ ", group=" + group + "]";
	}

}

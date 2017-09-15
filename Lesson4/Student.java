package com;

import java.util.Comparator;

public class Student extends Human {
	// implements Comparable<Student>

	private String univer;
	private String group;

	public Student(String name, String surname, int age, String sex, String univer) {
		super(name, surname, age, sex);
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
		return "Student [" + super.toString() + ", univer=" + univer + ", group=" + group + "]";
	}

	// @Override
	// public int compareTo(Student student) {
	// return this.getSurname().compareTo(student.getSurname());
	// }

	public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {
		public int compare(Student student1, Student student2) {
			return student1.getName().compareTo(student2.getName());
		}
	};

	public static Comparator<Student> StudentSurnameComparator = new Comparator<Student>() {
		public int compare(Student student1, Student student2) {
			return student1.getSurname().compareTo(student2.getSurname());
		}
	};

	public static Comparator<Student> StudentAgeComparator = new Comparator<Student>() {
		public int compare(Student student1, Student student2) {
			return student1.getAge() - student2.getAge();
		}
	};

	public static Comparator<Student> StudentSexComparator = new Comparator<Student>() {
		public int compare(Student student1, Student student2) {
			return student1.getSex().compareTo(student2.getSex());
		}
	};

}

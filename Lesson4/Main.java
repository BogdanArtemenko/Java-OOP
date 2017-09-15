package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 11 students and 1 group
		Student student1 = new Student("Tom", "Petrov", 27, "M", "NAU");
		Student student2 = new Student("Jhon", "Ivanov", 16, "M", "NAU");
		Student student3 = new Student("Jack", "Kapone", 18, "M", "NAU");
		Student student4 = new Student("Alex", "Kreig", 17, "M", "NAU");
		Student student5 = new Student("Peter", "Vang", 22, "M", "NAU");
		Student student6 = new Student("Anna", "Sisil", 18, "W", "NAU");
		Student student7 = new Student("Alla", "Groud", 17, "W", "NAU");
		Student student8 = new Student("Kate", "Vinslet", 19, "W", "NAU");
		Student student9 = new Student("Lilu", "Dalas", 17, "W", "NAU");
		Student student10 = new Student("Lucy", "Katch", 16, "W", "NAU");
		Student student11 = new Student("Juli", "Krot", 18, "W", "NAU");
		Group groupOne = new Group("A17");

		// add 10 students to the group
		groupOne.addStudent(student1);
		groupOne.addStudent(student2);
		groupOne.addStudent(student3);
		groupOne.addStudent(student4);
		groupOne.addStudent(student5);
		groupOne.addStudent(student6);
		groupOne.addStudent(student7);
		groupOne.addStudent(student8);
		groupOne.addStudent(student9);
		groupOne.addStudent(student10);
		// groupOne.createStudent();

		// sort by parameter and print group
		groupOne.sortGroup("Age");
		System.out.println();
		System.out.println(groupOne);
		System.out.println();

		// find student by name
		groupOne.findStudent("Alex");

		Voenkomat voenkomatOne = new Voenkomat("Central Army", "Kiev");
		System.out.println();
		voenkomatOne.checkGroup(groupOne);

	}

}

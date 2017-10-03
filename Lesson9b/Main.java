package com;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		// create Group, add 2 Students, save group to the file
		Group groupOne = new Group("A17");
		Student studentOne = new Student("Tom", "Petrov", 27, "M", "NAU");
		Student studentTwo = new Student("Jhon", "Ivanov", 16, "M", "NAU");
		Student studentThree = new Student("Carol", "Shevchenko", 23, "W", "KPI");
		groupOne.addStudent(studentOne);
		groupOne.addStudent(studentTwo);
		groupOne.addStudent(studentThree);
		System.out.println(groupOne);
		groupOne.removeStudent(studentThree);
		groupOne.sortGroup("Age");
		System.out.println(groupOne);
		File fileGroup = new File("/home/bogdan/workspace/Java/FolderTo/group.txt");
		groupOne.writeToFile(fileGroup);

		// create group from file
		Group groupTwo = new Group();
		groupTwo.createFromFile(fileGroup);
		System.out.println(groupTwo);

	}

}

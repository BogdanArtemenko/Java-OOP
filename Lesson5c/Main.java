package com;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		// create Group, add 2 Students, save group to the file
		Group groupOne = new Group("A17");
		Student student1 = new Student("Tom", "Petrov", 27, "M", "NAU");
		Student student2 = new Student("Jhon", "Ivanov", 16, "M", "NAU");
		groupOne.addStudent(student1);
		groupOne.addStudent(student2);
		File fileGroup = new File("/home/bogdan/workspace/Java/FolderFrom/group.txt");
		groupOne.writeToFile(fileGroup);

		// create group from file
		Group groupTwo = new Group();
		groupTwo.createFromFile(fileGroup);
		System.out.println(groupTwo);

	}

}

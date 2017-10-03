package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Group implements Voenkom {

	private String number;
	private List<Student> studentsArray = new ArrayList<>();

	public Group(String number) {
		super();
		this.number = number;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumber() {
		return number;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group - " + this.number);
		sb.append(System.lineSeparator());
		for (int i = 0; i < studentsArray.size(); i++) {
			if (studentsArray.get(i) != null) {
				sb.append((i + 1) + ") " + studentsArray.get(i));
			} else {
				sb.append((i + 1) + ") Free");
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	public void sortGroup(String sortparam) {
		if (sortparam == "Name") {
			Collections.sort(studentsArray, Student.StudentNameComparator);
		} else if (sortparam == "Surname") {
			Collections.sort(studentsArray, Student.StudentSurnameComparator);
		} else if (sortparam == "Age") {
			Collections.sort(studentsArray, Student.StudentAgeComparator);
		} else if (sortparam == "Sex") {
			Collections.sort(studentsArray, Student.StudentSexComparator);
		} else {
			System.out.println("--ERROR:Wrong sort parameter!");
		}
	}

	// add student to the group
	public void addStudent(Student student) {
		try {
			// check if student already there
			if (studentsArray.contains(student)) {
				System.out.println("--ERROR: Student " + student.getName() + " " + student.getSurname()
						+ " alredy present in the group " + this.number);
				return;
			}
			// add new student
			if (studentsArray.size() < 10) {
				studentsArray.add(student);
				student.setGroup(this.number);
				System.out.println("--MSG: Student " + student.getName() + " " + student.getSurname()
						+ " added to the group " + this.number);
				return;
			}
			throw new GroupIsFullException();
		} catch (GroupIsFullException e) {
			System.out.println(e.getMessage() + " " + this.number);
		}
	}

	// remove student from the group
	public void removeStudent(Student student) {
		if (studentsArray.contains(student)) {
			student.setGroup(null);
			studentsArray.remove(student);
			System.out.println("--MSG: Student " + student.getName() + " " + student.getSurname()
					+ " removed from group " + this.number);
			return;
		}
		System.out.println("--ERROR: Student " + student.getName() + " " + student.getSurname()
				+ " not found in the group " + this.number);
	}

	// find student in the group by name
	public void findStudent(String name) {
		for (int i = 0; i < studentsArray.size(); i++) {
			if (studentsArray.get(i).getName().equals(name)) {
				System.out.println("--MSG: Student found in the group " + this.number + " - " + studentsArray.get(i));
				return;
			}
		}
		System.out.println("--ERROR: Student " + name + " not found in the group " + this.number);
	}

	// create new student by user forms
	public void createStudent() {
		try {
			// create and add new student if there free place in the group
			if (studentsArray.size() < 10) {

				Student studentnew = new Student(JOptionPane.showInputDialog("Please input student name"),
						JOptionPane.showInputDialog("Please input student surname"),
						Integer.parseInt(JOptionPane.showInputDialog("Please input student age")),
						JOptionPane.showInputDialog("Please input student sex M/W"),
						JOptionPane.showInputDialog("Please input student university name"));

				studentsArray.add(studentnew);
				studentnew.setGroup(this.number);
				System.out.println("--MSG: Student " + studentnew.getName() + " " + studentnew.getSurname()
						+ " added to the group " + this.number);
				return;
			}
			throw new GroupIsFullException();
		} catch (GroupIsFullException e) {
			System.out.println(e.getMessage() + " " + this.number);
		}
	}

	@Override
	public ArrayList<String> getSoldiers() {
		ArrayList<String> solders = new ArrayList<String>();
		for (int i = 0; i < studentsArray.size(); i++) {
			if (studentsArray.get(i).getSex() == "M" && studentsArray.get(i).getAge() > 18) {
				solders.add(studentsArray.get(i).getName() + " " + studentsArray.get(i).getSurname());
			}
		}
		return solders;
	}

	// write group to the file
	public void writeToFile(File fileout) {
		try (PrintWriter out = new PrintWriter(fileout)) {
			out.println(this.getNumber());
			for (int i = 0; i < studentsArray.size(); i++) {
					out.println(studentsArray.get(i).toString());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// create group from file
	public void createFromFile(File file) {
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = in.readLine()) != null;) {
				String[] strArr = str.split(", ");
				if (strArr.length == 1) {
					this.number = strArr[0];
				} else if (strArr.length > 1) {
					Student studentBox = new Student(strArr[0], strArr[1], Integer.parseInt(strArr[2]), strArr[3],
							strArr[4]);
					this.addStudent(studentBox);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

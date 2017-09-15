package com;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Group implements Voenkom {

	private String number;
	private Student[] studentsArray = new Student[10];

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
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null) {
				sb.append((i + 1) + ") " + studentsArray[i]);
			} else {
				sb.append((i + 1) + ") Free");
			}
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	public void sortGroup(String sortparam) {
		if (sortparam == "Name") {
			Arrays.sort(studentsArray, Student.StudentNameComparator);
		} else if (sortparam == "Surname") {
			Arrays.sort(studentsArray, Student.StudentSurnameComparator);
		} else if (sortparam == "Age") {
			Arrays.sort(studentsArray, Student.StudentAgeComparator);
		} else if (sortparam == "Sex") {
			Arrays.sort(studentsArray, Student.StudentSexComparator);
		} else {
			System.out.println("--ERROR:Wrong sort parameter!");
		}
		// move null values to the end of array
		for (int i = 0; i < studentsArray.length - 1; i++) {
			for (int j = 0; j < studentsArray.length - 1; j++) {
				if (studentsArray[j] == null && studentsArray[j + 1] != null) {
					studentsArray[j] = studentsArray[j + 1];
					studentsArray[j + 1] = null;
				}
			}
		}

	}

	// add student to the group
	public void addStudent(Student student) {

		try {
			// check if student already there
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == student) {
					System.out.println("--ERROR: Student " + student.getName() + " " + student.getSurname()
							+ " alredy present in the group " + this.number);
					return;
				}
			}
			// add new student
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == null) {
					studentsArray[i] = student;
					student.setGroup(this.number);
					System.out.println("--MSG: Student " + student.getName() + " " + student.getSurname()
							+ " added to the group " + this.number);
					return;
				}
			}
			throw new GroupIsFullException();
		} catch (GroupIsFullException e) {
			System.out.println(e.getMessage() + " " + this.number);
		}
	}

	// remove student from the group
	public void removeStudent(Student student) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] == student) {
				studentsArray[i].setGroup(null);
				studentsArray[i] = null;
				System.out.println("--MSG: Student " + student.getName() + " " + student.getSurname()
						+ " removed from group " + this.number);
				return;
			}
		}
		System.out.println("--ERROR: Student " + student.getName() + " " + student.getSurname()
				+ " not found in the group " + this.number);
	}

	// find student in the group by name
	public void findStudent(String name) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].getName() == name) {
				System.out.println("--MSG: Student found in the group " + this.number + " - " + studentsArray[i]);
				return;
			}
		}
		System.out.println("--ERROR: Student " + name + " not found in the group " + this.number);
	}

	// create new student by user forms
	public void createStudent() {
		try {
			// create and add new student if there free place in the group
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == null) {

					Student studentnew = new Student(JOptionPane.showInputDialog("Please input student name"),
							JOptionPane.showInputDialog("Please input student surname"),
							Integer.parseInt(JOptionPane.showInputDialog("Please input student age")),
							JOptionPane.showInputDialog("Please input student sex M/W"),
							JOptionPane.showInputDialog("Please input student university name"));

					studentsArray[i] = studentnew;
					studentnew.setGroup(this.number);
					System.out.println("--MSG: Student " + studentnew.getName() + " " + studentnew.getSurname()
							+ " added to the group " + this.number);
					return;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public ArrayList<String> getSoldiers() {
		// TODO Auto-generated method stub
		ArrayList<String> solders = new ArrayList<String>();
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].getSex() == "M" && studentsArray[i].getAge() > 18) {
				solders.add(studentsArray[i].getName() + " " + studentsArray[i].getSurname());
			}
		}
		return solders;
	}

}

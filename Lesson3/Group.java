package com;

public class Group {

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

		sortGroup();

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

	public void sortGroup() {
		Student maxStudent;
		int posMax;

		// moves null values to the end of array
		for (int i = 0; i < studentsArray.length - 1; i++) {
			for (int j = 0; j < studentsArray.length - 1; j++) {
				if (studentsArray[j] == null && studentsArray[j + 1] != null) {
					studentsArray[j] = studentsArray[j + 1];
					studentsArray[j + 1] = null;
				}
			}
		}

		// sort array by student name finding max value
		for (int i = 0; i < studentsArray.length - 1; i++) {
			maxStudent = studentsArray[i];
			posMax = i;
			for (int j = i + 1; j < studentsArray.length; j++) {
				if (studentsArray[j] != null
						&& maxStudent
								.getName()
								.toUpperCase()
								.compareTo(
										studentsArray[j].getName()
												.toUpperCase()) > 0) {
					maxStudent = studentsArray[j];
					posMax = j;
				}
			}
			studentsArray[posMax] = studentsArray[i];
			studentsArray[i] = maxStudent;
		}

	}

	// add student to the group
	public void addStudent(Student student) {

		try {
			// check if student already there
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == student) {
					System.out.println("--ERROR: Student " + student.getName()
							+ " alredy present in the group " + this.number);
					return;
				}
			}
			// add new student
			for (int i = 0; i < studentsArray.length; i++) {
				if (studentsArray[i] == null) {
					studentsArray[i] = student;
					student.setGroup(this.number);
					System.out.println("--MSG: Student " + student.getName()
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
				System.out.println("--MSG: Student " + student.getName()
						+ " removed from group " + this.number);
				return;
			}
		}
		System.out.println("--ERROR: Student " + student.getName()
				+ " not found in the group " + this.number);
	}

	// find student in the group by name
	public void findStudent(String name) {
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null && studentsArray[i].getName() == name) {
				System.out.println("--MSG: Student found in the group "
						+ this.number + " - " + studentsArray[i]);
				return;
			}
		}
		System.out.println("--ERROR: Student " + name
				+ " not found in the group " + this.number);
	}

}

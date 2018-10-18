package lecture6;

public class StudentsManagerArrayImplementation implements StudentsManager {
	private Student[] students = new Student[10];
	int totalStudents = 0;

	@Override
	public void addStudent(Student s) {
		students[totalStudents] = s;
		totalStudents++;

	}

	@Override
	public void updateStudent(int rollNumber, Student s) {
		StudentSearchCriterion ssc = new StudentSearchCriterion();
		ssc.rollNumber = rollNumber;
		Student[] matchingStudents = findStudents(ssc);
		if (matchingStudents == null)
			throw new RuntimeException("No student matching -> " + rollNumber);
		if (matchingStudents.length > 1) {
			throw new RuntimeException("I can only update one student");
		}
		Student student = matchingStudents[0];
		student.setFirst(s.getFirst());
		student.setLast(s.getLast());

	}

	@Override
	public int getStudentsCount() {
		return totalStudents;
	}

	@Override
	public void removeStudent(int rollNumber) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null)
				continue;
			if (students[i].getRollNumber() == rollNumber) {
				students[i] = null;
				totalStudents--;
			}
		}

	}

	@Override
	public Student[] findStudents(StudentSearchCriterion ssc) {
		Student[] s = new Student[1];
		for (Student student : students) {
			if (student.getRollNumber() == ssc.rollNumber) {
				s[0] = student;
				return s;
			}
		}
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return students;
	}

	@Override
	public void displayStudents() {
		for (Student s : students) {
			System.out.println(s);
		}

	}

}

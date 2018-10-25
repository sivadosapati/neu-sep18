package lecture6;

import java.util.HashMap;
import java.util.Map;

public class StudentsManagerWithMapImplementation implements StudentsManager {

	private Map<Integer, Student> studentsMap = new HashMap<Integer, Student>();

	@Override
	public void addStudent(Student s) {
		studentsMap.put(s.getRollNumber(), s);

	}

	@Override
	public void updateStudent(int rollNumber, Student s) {
		studentsMap.put(rollNumber, s);

	}

	@Override
	public int getStudentsCount() {
		return studentsMap.size();
	}

	@Override
	public void removeStudent(int rollNumber) {
		studentsMap.remove(rollNumber);

	}

	@Override
	public Student[] findStudents(StudentSearchCriterion ssc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		Student[] students = new Student[studentsMap.size()];
		studentsMap.values().toArray(students);
		return students;
	}

	@Override
	public void displayStudents() {
		// System.out.println(studentsMap.values());
		for (Student s : studentsMap.values()) {
			System.out.println(s.toString());
		}

	}

}

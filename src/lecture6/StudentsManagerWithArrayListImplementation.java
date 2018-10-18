package lecture6;

import java.util.LinkedList;
import java.util.List;

public class StudentsManagerWithArrayListImplementation implements StudentsManager {

	// private ArrayList students = new ArrayList();
	private List<Student> students = new LinkedList<Student>();

	@Override
	public void addStudent(Student s) {
		students.add(s);
	}

	@Override
	public void updateStudent(int rollNumber, Student s) {
		for (Student st : students) {

			if (st.getRollNumber() == rollNumber) {
				st.setFirst(s.getFirst());
				st.setLast(s.getLast());
			}
		}

	}

	@Override
	public int getStudentsCount() {
		return students.size();
	}

	@Override
	public void removeStudent(int rollNumber) {
		Student matched = null;
		for (Student st : students) {

			if (st.getRollNumber() == rollNumber) {
				matched = st;
				break;
			}
		}
		students.remove(matched);
	}

	@Override
	public Student[] findStudents(StudentSearchCriterion ssc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student[] getAllStudents() {
		return (Student[]) students.toArray();
	}

	@Override
	public void displayStudents() {
		for (Object s : students) {
			System.out.println(s);
		}
	}

}

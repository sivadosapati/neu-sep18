package lecture6;

//CRUD - Create, Read, Update, Delete
public interface StudentsManager {
	public void addStudent(Student s);

	public void updateStudent(int rollNumber, Student s);

	public int getStudentsCount();

	public void removeStudent(int rollNumber);

	public Student[] findStudents(StudentSearchCriterion ssc);

	public Student[] getAllStudents();
	
	public void displayStudents();
}

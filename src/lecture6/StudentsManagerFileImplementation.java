package lecture6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class StudentsManagerFileImplementation implements StudentsManager {

	private StudentsManager existingImplementation;
	private File file;

	public StudentsManagerFileImplementation(File file, StudentsManager existingImplementation) {
		this.file = file;
		this.existingImplementation = existingImplementation;
		populateStudents();
	}

	private void populateStudents() {
		try {
			if (file.exists() == false)
				return;
			FileInputStream fis = new FileInputStream(file);
			Scanner scanner = new Scanner(fis);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				Student student = makeStudent(line);
				existingImplementation.addStudent(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Student makeStudent(String line) {
		Student student = new Student();
		String[] tokens = line.split("\\|");
		student.setRollNumber(Integer.parseInt(tokens[0]));
		student.setFirst(tokens[1]);
		student.setLast(tokens[2]);
		return student;
	}

	@Override
	public void addStudent(Student s) {
		existingImplementation.addStudent(s);
		try {
			writeStudentIntoFile(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void writeStudentIntoFile(Student s) throws Exception {
		FileOutputStream fos = new FileOutputStream(file, true);
		writeStudent(s, fos);
		fos.close();

	}

	private void writeStudent(Student s, FileOutputStream fos) throws IOException {
		// writeStudentUsingFileOutputStream(s, fos);
		writeStudentUsingPrintStream(s, fos);
	}

	private void writeStudentUsingPrintStream(Student s, FileOutputStream fos) {
		PrintStream ps = new PrintStream(fos);
		ps.println(s.getRollNumber() + "|" + s.getFirst() + "|" + s.getLast());
		ps.flush();

	}

	private void writeStudentUsingFileOutputStream(Student s, FileOutputStream fos) throws IOException {
		String line = s.getRollNumber() + "|" + s.getFirst() + "|" + s.getLast();
		byte b[] = (line + "\n").getBytes();
		fos.write(b);
	}

	@Override
	public void updateStudent(int rollNumber, Student s) {
		existingImplementation.updateStudent(rollNumber, s);
		writeAllStudentsIntoFile();
	}

	private void writeAllStudentsIntoFile() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file, false);
			for (Student s : existingImplementation.getAllStudents()) {
				System.out.println("Student -> " + s.toString());
				writeStudent(s, fos);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (Exception e) {
				}
		}

	}

	@Override
	public int getStudentsCount() {
		return existingImplementation.getStudentsCount();
	}

	@Override
	public void removeStudent(int rollNumber) {
		existingImplementation.removeStudent(rollNumber);
		writeAllStudentsIntoFile();

	}

	@Override
	public Student[] findStudents(StudentSearchCriterion ssc) {
		return existingImplementation.findStudents(ssc);
	}

	@Override
	public Student[] getAllStudents() {
		return existingImplementation.getAllStudents();
	}

	@Override
	public void displayStudents() {
		existingImplementation.displayStudents();
	}

}

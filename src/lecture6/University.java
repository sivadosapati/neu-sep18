package lecture6;

import java.util.Scanner;

public class University {

	public static void main(String[] args) {
		// StudentsManager manager = new StudentsManagerArrayImplementation();
		StudentsManager manager = new StudentsManagerWithArrayListImplementation();
		// ADD, DELETE, UPDATE, DISPLAY, COUNT,
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your choice (ADD|DELETE|UPDATE|DISPLAY|COUNT|EXIT");
			String input = scanner.nextLine();
			if ("EXIT".equalsIgnoreCase(input)) {
				break;
			}
			if ("ADD".equals(input)) {
				System.out.println("Enter the Student Information (Roll,First,Last");
				String s = scanner.nextLine();
				Student student = makeStudent(s);
				manager.addStudent(student);
			}
			if (input.equals("DELETE")) {
				System.out.println("Enter the Student's roll number that needs to be deleted");
				int roll = Integer.parseInt(scanner.nextLine());
				manager.removeStudent(roll);
			}
			if (input.equals("UPDATE")) {
				System.out.println("Enter the Student Information (Roll, First, Last");
				String line = scanner.nextLine();
				Student s = makeStudent(line);
				manager.updateStudent(s.getRollNumber(), s);
			}
			if (input.equals("DISPLAY")) {
				manager.displayStudents();
			}
			if (input.equals("COUNT")) {
				System.out.println("Total # of Students = " + manager.getStudentsCount());
			}
		}

	}

	private static Student makeStudent(String line) {
		String tokens[] = line.split(",");
		Student s = new Student();
		s.setRollNumber(Integer.parseInt(tokens[0]));
		s.setFirst(tokens[1]);
		s.setLast(tokens[2]);
		return s;
	}

}

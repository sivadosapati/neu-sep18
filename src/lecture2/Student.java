package lecture2;

public class Student {
	byte age;
	char initial;
	char[] name = new char[20];
	boolean gender;

	public String toString() {
		return name + " -> " + gender + " -> " + age;

	}

	static int countFemalesWithLoops(Student students[]) {
		int femaleCount = 0;
		for (Student s : students) {
			if (s != null && s.gender) {
				femaleCount++;
			} else {
				System.out.println("Student[" + s + "] is not a female");
			}
		}
		return femaleCount;
	}

	public static int countFemales(Student students[]) {
		int femaleCount = 0;
		if (students[0].gender == true) {
			femaleCount++;
		} else {
			System.out.println(students[0]);
		}
		if (students[1].gender == true) {
			femaleCount++;
		} else {
			System.out.println(students[1]);
		}
		if (students[2].gender == true) {
			femaleCount++;
		} else {
			System.out.println(students[2]);
		}
		if (students[3].gender == true) {
			femaleCount++;
		} else {
			System.out.println(students[3]);
		}
		if (students[4] != null && students[4].gender == true) {
			femaleCount++;
		} else {
			System.out.println(students[4]);
		}
		return femaleCount;

	}

	public static void main(String args[]) {
		Student arya = new Student();
		Student sailee = new Student();
		Student ching = new Student();
		Student divya = new Student();
		System.out.println(divya.age + " -> " + divya.initial + " -> " + divya.name);
		arya.age = 40;
		sailee.age = 50;
		ching.age = 60;
		short totalAge = (short) (arya.age + sailee.age + ching.age);
		System.out.println(totalAge);
		System.out.println(ching.initial);
		divya.name = new char[] { 'd', 'i', 'v', 'y', 'a' };
		arya.name = new char[] { 'a', 'r', 'y', 'a' };

		System.out.println(divya.name.length + arya.name.length);

		Student[] students = new Student[5];
		students[0] = arya;
		arya.gender = true;
		students[1] = sailee;
		sailee.gender = true;
		students[2] = divya;
		divya.gender = true;
		students[3] = ching;
		ching.gender = false;
		// students[4] = new Student();
		// students[4].gender = true;

		System.out.println(students[3]);
		System.out.println("Total Number of Female Students...");

		// System.out.println(countFemales(students));
		System.out.println("Total Number of Female Students using Looops..");
		System.out.println(countFemalesWithLoops(students));

		// System.out.println(students[10]);

	}
}

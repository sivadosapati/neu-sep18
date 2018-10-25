package lecture6;

import java.io.Serializable;

public class Student implements Comparable, Serializable {
	private int rollNumber;
	private String first;
	private String last;

	public Student() {

	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		if (s.rollNumber == this.rollNumber)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return this.getRollNumber();
	}

	Student(int r, String f, String l) {
		this.rollNumber = r;
		this.first = f;
		this.last = l;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String toString() {
		return "[Roll, First, Last] = [" + getRollNumber() + "," + getFirst() + "," + getLast() + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return s.getRollNumber() - this.getRollNumber();
	}
}

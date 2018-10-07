package lecture4;

//Abstract class is a concept where an Object of this class can't be created
//Abstract class can have abstract methods
//If a class has one abstract method - the class needs to be abstract
//Interface is a definition of a contract. A class can implement one or more interfaces
//Object is the base class for all classes
//static variable means every objet of the class will share the state
//static methods means every object of the class invoke through class
//final variables mean the state can't be changed after it is initialized
//final methods can't be overriden in the child classes
//final classes can't be subclassed
//Unit Testing is a way to write tests for every logic and ensure that they are always run and are green

public class Examples {

	public static void main(String[] arguments) throws Exception {
		Fruit f = new Banana();
		f = new Grape();
		if (arguments.length != 0) {
			String first = arguments[0];
			if (first.equals("Banana"))
				f = new Banana();
			if (first.equals("Grape"))
				f = new Grape();
		}
		// f = new SeedlessGrape();
		f.eat();

		Professor p;
		p = new IndustryExperiencedPerson();
		p = new TA();
		p.teach();
		p.answerQuestion();

		PhotographCapturer pc;
		Printer printer;
		MacLaptop mac = new MacLaptop();
		pc = mac;
		Picture pic = pc.capture();
		// printer = pc;
		printer = mac;
		printer.print(pic);

		InternetBrowser ib;

		iPhone ip = new iPhone();
		ib = ip;
		Class.forName("Student");
		System.out.println("Before the first student is created");
		Student s = new Student();
		System.out.println(s.toString());
		// s.display();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s.equals(s));
		System.out.println(s.equals(null));
		s.gpa = 2.0f;
		System.out.println(s.equals(new Student()));
		Student x = new Student();
		x.gpa = 2.0f;
		System.out.println("Compare -> " + s.equals(x));
		System.out.println(s.equals(ip));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		Student charu = new Student();
		Student gao = new Student();
		System.out.println(charu + "\n" + gao);
		// charu.teacher.name="Cva";
		Student.teacher.name = "Siva Kumar Dosapati";
		// charu.teacher = null;
		System.out.println(charu + "\n" + gao);

		System.out.println("***************");
		// charu.askQuestion();
		Student.askQuestion();

	}

}

class Algebra {
	static final float PI = 22 / 7;

	public void calculate() {
		// PI = 22/3;
	}

	public final int sum(int a, int b) {
		return a + b;
	}
}

class SuperAlgebra extends Algebra {

}

class Teacher extends BaseObject {
	String name = "Siva";

	public Teacher() {
		System.out.println(name + " is created");
	}

	public void answerQuestion() {
		p("Teacher answering question");
	}
}

class Student extends BaseObject {

	static Teacher teacher = new Teacher();

	public static void askQuestion() {
		p("Student Asking Question to Teacher");
		teacher.answerQuestion();
		// p("Student's gpa -> "+gpa);
	}

	public String getTeacherName() {
		return "Student's Teacher name is -> " + teacher.name + " -> " + teacher.toString();
	}

	float gpa;

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object == null) {
			return false;
		}
		if (object instanceof Student == false) {
			return false;
		}
		Student input = (Student) object;
		if (this.gpa == input.gpa)
			return true;
		return false;
	}

	public String toString() {
		return "I'm a Student -> " + super.toString() + " -> " + getTeacherName();
	}
}

interface Professor {
	public void teach();

	public void answerQuestion();
}

class TA extends BaseObject implements Professor {
	public void teach() {
		p("TA teaching class because professor is not in town");
	}

	public void answerQuestion() {
		p("I don't know how to answer question");
	}
}

class BaseObject {
	static void p(String s) {
		System.out.println(s);
	}
}

class Employee extends BaseObject {

}

class EngineeringDirector extends Employee {

}

class IndustryExperiencedPerson extends EngineeringDirector implements Professor {
	public void teach() {
		p("Teach");
	}

	public void answerQuestion() {
		p("Answer Question");
	}

}

interface InternetBrowser {

	void browseInternet();
}

abstract class Fruit {
	float price;

	float getPrice() {
		return price;
	}

	abstract void eat();

	void p(String string) {
		System.out.println(string);
	}
}

final class Banana extends Fruit {
	void eat() {
		System.out.println("Take of the Peel and eat the banana");
	}

}

//class SmallBanana extends Banana {
//}

class Grape extends Fruit {
	void eat() {
		p("Clean and eat the grape");
	}

}

abstract class SeedlessGrape extends Grape {
	abstract float getPrice();
}

interface Printer {
	void print(Picture p);

	void display();
}

interface PhotographCapturer {
	Picture capture();

	void display(String string);
}

abstract class Camera implements PhotographCapturer {

}

class Cannon extends Camera implements PhotographCapturer {
	public Picture capture() {
		return new Picture();
	}

	public void display(String string) {
	}
}

class MacLaptop extends BaseObject implements PhotographCapturer, Printer {
	public Picture capture() {
		return new Picture();
	}

	public void print(Picture p) {
		p("Printing Picture -> " + p);
	}

	public void display() {
	}

	public void display(String s) {
	}
}

class LaserPrinter implements Printer {
	public void print(Picture p) {
	}

	public void display() {
	}
}

class iPhone extends BaseObject implements PhotographCapturer, InternetBrowser {
	public Picture capture() {
		return new Picture();
	}

	public void display(String s) {
	}

	public void makeCall() {
	}

	public void browseInternet() {
	}

	public void wakeUp() {
	}

	public void playMusic() {
	}

	public void playGames() {
	}

	public void sendMessages() {
	}

	public void watchVideos() {
	}

	public void actAsAPaperHolder() {
	}

	public void calculate() {
	}

	public void takeNotes() {
	}

}

class Picture {
}

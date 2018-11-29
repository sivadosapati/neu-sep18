package lecture9;

public class Student extends Person {
	Student a;
	Student b;

	public void setStudentA(Student x) {
		this.a = x;

	}

	public void setStudentB(Student b) {
		this.b = b;
	}

	Student(String name) {
		super(name);
	}

	public void answer(String question) {
		loop("Answer question -> " + question);
	}

	public void parallelAnswer(String question) {
		try {
			Thread at = new Thread(() -> a.answer(question));
			Thread bt = new Thread(() -> b.answer(question));
			at.start();
			bt.start();
			//at.join();
			//bt.join();
			System.out.println(name + " has the final answer");
		} catch (Exception e) {
		}
	}

	public static void main(String args[]) {
		Student mihir = new Student("Mihir");
		Student divya = new Student("Divya");
		Student vinee = new Student("Vinee");
		Student arya = new Student("Arya");
		arya.setStudentA(new Student("DinFan"));
		arya.setStudentB(new Student("Ray"));

		new Thread(() -> mihir.answer("How is weather")).start();
		new Thread(() -> divya.answer("How is weather")).start();
		new Thread(() -> vinee.answer("How is weather")).start();
		new Thread(() -> arya.parallelAnswer("How is weather")).start();

	}

}

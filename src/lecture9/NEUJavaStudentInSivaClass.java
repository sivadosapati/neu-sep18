package lecture9;

public class NEUJavaStudentInSivaClass extends Person {

	private static Object QUESTION_LOCK = new Object();

	NEUJavaStudentInSivaClass(String name) {
		super(name);
	}

	public synchronized void askQuestion() {
		System.out.println(name+" is about to ask a question");
		synchronized (NEUJavaStudentInSivaClass.class) {
			loop("question");
		}
		System.out.println(name+" is done asking a question");
	}

	public static void main(String args[]) {
		NEUJavaStudentInSivaClass xinrui = new NEUJavaStudentInSivaClass("Xinrui");
		NEUJavaStudentInSivaClass jennifer = new NEUJavaStudentInSivaClass("Jennifer");
		makeThread(jennifer).start();
		makeThread(xinrui).start();
	}

	private static Thread makeThread(NEUJavaStudentInSivaClass student) {
		return new Thread(() -> student.askQuestion());
	}

}

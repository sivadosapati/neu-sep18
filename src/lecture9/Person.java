package lecture9;

public class Person {

	protected String name;

	// private boolean eating = false;

	Person(String name) {
		this.name = name;
	}

	public void see() {
		loop("seeing");
	}

	public void think() {
		loop("thinking");
	}

	public synchronized void eat() {
		// eating = true;
		loop("eating");
		// eating = false;
	}

	public void loop(String x) {
		for (int i = 0; i < 10; i++) {
			System.out.println(new java.sql.Time(System.currentTimeMillis()) + " -> " + name + " is " + x + " " + i);
			pause(random(100));
		}

	}

	public int random(int x) {
		return (int) (Math.random() * x);
	}

	public void talk() {
		System.out.println("I'm about to Talk");
		pause(125);
		// if (eating == false)
		// loop("talking");
		synchronized (this) {
			loop("talking");
		}
		System.out.println("I finished Talking");
	}

	public void pause(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}

	static class ThinkingThread implements Runnable {
		Person p;

		ThinkingThread(Person p) {
			this.p = p;
		}

		public void run() {
			p.think();
		}
	}

	public static void main(String arghs[]) throws Exception {
		long start = System.currentTimeMillis();
		Person p = new Person("Siva");
		Person p1 = new Person("Mihir");
		Person vini = new Person("Vini");
		Person divya = new Person("Divya");

		// p.see();
		// p.talk();

		// p.see();
		// p.talk();
		SeeingThread see = new SeeingThread(p);
		TalkingThread talk = new TalkingThread(p);
		SeeingThread mSee = new SeeingThread(p1);
		ThinkingThread tt = new ThinkingThread(p);
		Thread thinkingThread = new Thread(tt);
		thinkingThread.start();
		see.start();
		talk.start();

		see.join();
		talk.join();
		thinkingThread.join();

		// talk.start();
		System.out.println("All Threads are done..");
		// mSee.start();

		// vini.see();
		// divya.see();
		SeeAndTalkThread stt = new SeeAndTalkThread(p);
		// stt.start();
		long end = System.currentTimeMillis();
		// System.out.println("Total Time - > " + (end - start));
	}

	static class SeeingThread extends Thread {
		private Person p;

		public SeeingThread(Person p) {
			this.p = p;
		}

		public void run() {
			p.see();
		}
	}

	static class TalkingThread extends Thread {
		private Person p;

		public TalkingThread(Person p) {
			this.p = p;
		}

		public void run() {
			p.talk();
		}
	}

	static class SeeAndTalkThread extends Thread {
		private Person p;

		public SeeAndTalkThread(Person p) {
			this.p = p;
		}

		public void run() {
			p.see();
			p.talk();
		}
	}

}

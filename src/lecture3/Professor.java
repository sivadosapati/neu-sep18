package lecture3;

import java.util.Scanner;

public class Professor {

	int money;
	String name;

	Professor(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String toString() {
		return name + " has " + money + " dollars";
	}

	public static void main(String[] args) {
		// invokeProfessor();
		// invokeProtectedProfessor();
		changeNames();

	}

	private static void changeNames() {
		ProfessorProtectingMoney siva = new ProfessorProtectingMoney("cva", 100);
		System.out.println(siva);
		siva.setName("Siva");
		System.out.println(siva);
		siva.setName("Ram");
		System.out.println(siva);
		siva.setName("John");
		System.out.println(siva);

	}

	private static void invokeProfessor() {
		Professor siva = new Professor("cva", 100);
		System.out.println(siva.toString());
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (true) {
			System.out.println("Student # " + counter + " ask for how much you want");
			int ask = scanner.nextInt();
			counter++;
			if (ask == -1) {
				break;
			}
			siva.money = siva.money - ask;
			System.out.println("Take " + ask + " dollars " + siva.toString());
		}
	}

	private static void invokeProtectedProfessor() {
		ProfessorProtectingMoney siva = new ProfessorProtectingMoney("cva", 100);
		System.out.println(siva.toString());
		Scanner scanner = new Scanner(System.in);
		int counter = 1;
		while (true) {
			System.out.println("Student # " + counter + " ask for how much you want");
			int ask = scanner.nextInt();
			counter++;
			if (ask == -1) {
				break;
			}
			// siva.money = siva.money - ask;
			int give = siva.give(ask);
			System.out.println("Take " + give + " dollars " + siva.toString());
		}

	}

}

class ProfessorProtectingMoney {
	private int money;
	private String name;
	private boolean feelingWell;
	


	public boolean isFeelingWell() {
		return feelingWell;
	}

	public void setFeelingWell(boolean feelingWell) {
		this.feelingWell = feelingWell;
	}

	int nameChange = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		nameChange++;
		if (nameChange > 2) {
			throw new RuntimeException(
					"Name can't be changed to " + name + " as it was already changed 2 times before");
		}
		this.name = name;
	}

	ProfessorProtectingMoney(String name, int money) {
		this.money = money;
		this.name = name;
	}

	public int give(int ask) {
		if (ask > money) {
			throw new RuntimeException("I have only " + money + " dollars, but you are asking " + ask + " dollars");
		}
		money = money - ask;
		return ask;
	}

	public String toString() {
		return name + " has " + money + " dollars";
	}
}

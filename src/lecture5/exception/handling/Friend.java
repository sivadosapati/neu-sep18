package lecture5.exception.handling;

class NoMoneyException extends Exception {
	int price;

	NoMoneyException(int price) {
		this.price = price;
	}
}

class RunOutOfGasException extends Exception {
}

public class Friend {

	public Groceries getGroceries() throws NoMoneyException, RunOutOfGasException {
		System.out.println("Getting groceries");
		checkForGasOnYourWay();
		int x = getRandom(25);
		if (x > 5) {
			throw new NoMoneyException(x);
		}
		return new Groceries(x);
	}

	private void checkForGasOnYourWay() throws RunOutOfGasException{
		int x = getRandom(10);
		if (x > 5) {
			throw new RunOutOfGasException();
		}

	}

	public Groceries getGroceries(int price) {
		return new Groceries(price);
	}

	public int getRandom(int number) {
		return (int) (Math.random() * number);
	}
}

class Groceries {
	float price;

	Groceries(float price) {
		this.price = price;
	}

	public String toString() {
		return "Total cost of Groceries is " + price + " dollars";
	}
}

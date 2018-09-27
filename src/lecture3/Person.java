package lecture3;

public class Person {
	
	public void cut(Fruit f) {
		// System.out.println("Cutting -> " + f.getClass().getName());
		f.cutMe();
	}

	public void eatChocolate(Chocolate c) {
		System.out.println("Eating chocolate");
	}

	public void eatBiscuit(Biscuit b) {
		System.out.println("Eating biscuit");
	}

	public void eat(Chocolate c) {
		System.out.println("Chocolate");
	}

	public void eat(Icecream ic) {
		System.out.println("Icecream");
	}

	public void eat(Biscuit b) {
		System.out.println("Biscuit");
	}

	public void eat(Food f) {
	}

	public void eat(Food a, Food b) {
		System.out.println("Eat -> " + a.getClass().getName());
		System.out.println("Eat -> " + b.getClass().getName());
	}
	void eat(Chocolate c, Biscuit b) {}
	void eat(Biscuit b, Chocolate c) {}

}

class Food {
}

class Chocolate extends Food {
}

class Biscuit extends Food {
}

class Icecream extends Food {
}

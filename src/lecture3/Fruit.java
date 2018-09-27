package lecture3;

public class Fruit {

	void cutMe() {
		throw new RuntimeException("Figure out how to cut me");
	}

	protected int price;
	private double weight;
	private boolean spoiled;

	protected double getDiscount() {
		return getDefaultDiscountForAllFruits();
	}

	public double getDefaultDiscountForAllFruits() {
		return 0.20;
	}

	Fruit(int price, double weight) {
		this.price = price;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		Apple a = new Apple(2, 0.5);
		Banana b = new Banana(1, 0.25);
		System.out.println(a.getPrice());
		System.out.println(b.getWeight());
		a.setPrice(5);
		System.out.println(a);
		System.out.println(b);
		System.out.println("-------");
		System.out.println("Apple's discount -> " + a.getDiscount());
		System.out.println("Banana's discount -> " + b.getDiscount());
		System.out.println("-----");
		Mango m = new Mango(10, 4.5);
		System.out.println("Mango's discount -> " + m.getDiscount());
		m.setPrice(2);
		System.out.println("Mango's discount -> " + m.getDiscount());

	}

	public String toString() {
		return "Fruit [Price,Weight] = [" + getPrice() + "," + getWeight() + "]";
	}

}

class Mango extends Fruit {

	Mango(int price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

	public double getDiscount() {
		if (price > 4) {
			return 0.5;
		} else {
			return super.getDiscount();
		}
	}

}

class Apple extends Fruit {

	private int numberOfSeeds;

	public int getSeedCount() {
		return numberOfSeeds;
	}

	@Override
	public double getDiscount() {
		return 0;
	}

	Apple(int price, double weight) {
		super(price, weight);
		// this.numberOfSeeds = 10;

	}

	Apple(int price, double weight, int numberOfSeeds) {
		// super(price, weight);
		this(price, weight);
		this.numberOfSeeds = numberOfSeeds;
	}

	void cutMe() {
		System.out.println("Apple can be cut without taking of the skin");
	}

}

class RedApple extends Apple {

	RedApple(int price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

	public double getDiscount() {
		if (getPrice() > 10) {
			return 1.0;

		}
		if (getPrice() > 5) {
			return super.getDiscount();
		}
		if (getPrice() < 5) {
			return getDefaultDiscountForAllFruits();
		}
		return 0;
	}

}

class Banana extends Fruit {

	Banana(int price, double weight) {
		super(price, weight);

	}

	@Override
	void cutMe() {
		System.out.println("Banana can be cut by taking off the peel");
	}

}

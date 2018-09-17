package lecture2;

public class Fruit {

	String name;
	float price;
	boolean spoiled;

	public float getDiscountedPrice() {
		if (spoiled) {
			// return price * 0.5f;
			if (price < 5) {
				return price * (1 - 0.1f);
			}
			if (price > 5 && price < 10) {
				return price * (1 - 0.2f);
			}
			if (price > 10 && price < 20) {
				return price * (1 - 0.3f);
			}
			return price * (1 - 0.5f);
		} else {
			// System.out.println("Not spoiled. so no discount");
			return price;
		}
	}

	public String toString() {
		return "Fruit[Name,Price,Spoiled] = [" + name + "," + price + "," + spoiled + "]";
	}

	static void eat(Fruit f) {
		if (f.spoiled) {
			System.out.println("I can't eat -> " + f + " -> because it is spoiled");
		} else {
			System.out.println(f + " -> is not spoiled. I'm eating it");
		}
	}

	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.name = "Mango";
		f.price = 7f;
		f.spoiled = true;
		eat(f);

		System.out.println(f.toString());
		System.out.println(f.price + " -> " + f.getDiscountedPrice());

	}

}

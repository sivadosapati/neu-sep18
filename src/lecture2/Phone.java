package lecture2;

public class Phone {

	float price;
	PhoneColor color;
	int memory;

	Phone() {
		this(PhoneColor.BLACK, 200, 8);
		// price = 200;
		// color = PhoneColor.BLACK;
		// memory = 8;
	}

	Phone(PhoneColor pc, float price, int memory) {
		System.out.println("Calling another constructor");
		color = pc;
		this.price = price;
		this.memory = memory;
	}

	Phone(PhoneColor pc, int memory) {

		this(pc, 500, memory);
		System.out.println("Calling another constructor");
		// this.color = pc;
		// this.memory = memory;
	}

	Phone(PhoneColor pc, float price) {
		this(pc, price, 256);
	}

	public String toString() {
		return "[Price,Color,Memory]=[" + price + "," + color + "," + memory + "]";
	}

	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		Phone anotherPhone = new Phone();
		System.out.println(anotherPhone);

		Phone chingPhone = new Phone(PhoneColor.BLACK, 1000, 64);
		System.out.println(chingPhone);

		Phone aryaPhone = new Phone(PhoneColor.BLUE, 128);
		System.out.println(aryaPhone);

		Phone tongPhone = new Phone(PhoneColor.BLACK, 459);
		System.out.println(tongPhone);
	}

}

enum PhoneColor {
	WHITE, GOLD, PINK, BLACK, BLUE;
}

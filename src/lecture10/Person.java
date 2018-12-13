package lecture10;

interface Person {
	public default void talk() {
		System.out.println("Talk");
	};

	public default void eat() {
		System.out.println("Eat");
	}

	public static void sayHello() {
		System.out.println("Say Hello");
	}

}

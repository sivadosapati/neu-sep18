package lecture3;

public class Home {

	public static void main(String[] args) {
		Person siva = new Person();
		Chocolate c = new Chocolate();
		Biscuit b = new Biscuit();
		siva.eatBiscuit(b);
		siva.eatChocolate(c);

		siva.eat(b);
		siva.eat(new Icecream());

		Apple a = new Apple(3, 0.3);
		Banana ban = new Banana(2, 0.2);

		siva.cut(a);
		siva.cut(ban);

		Fruit f = new Mango(10, 0.5);
		System.out.println("------------------");
		Fruit f1 = ban;
		siva.cut(f1);
		Fruit f2 = a;
		siva.cut(f2);

		siva.cut(f);
		f = a;
		siva.cut(f);
		
		Fruit fruit = new Apple(10,2.3);
		Apple apple = new Apple(10,4.5);
		
		apple = (Apple)fruit;

	}

}

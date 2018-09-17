package lecture2;

public class Professor {
	StringBuffer name;
	int age = 25;

	public String toString() {
		return name + " -> " + age;
	}

	public static void main(String[] args) {
		Professor cva = null;
		// System.out.println(cva);
		cva = new Professor();
		cva.name = new StringBuffer("Siva");
		System.out.println(cva.name);
		cva.name.deleteCharAt(0);
		System.out.println(cva.name);
		cva.name.deleteCharAt(0);
		cva.name.insert(0, 'c');
		System.out.println(cva.name);

		System.out.println(cva.toString());

	}

}

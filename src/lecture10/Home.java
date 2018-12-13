package lecture10;

public class Home {

	public static void main(String[] args) {
		Person p = new Engineer();
		p.talk();
		Person.sayHello();

	}

}

class Engineer implements Person, Mammal {

	public void talk() {
		System.out.println("Engineer is Talking");
	}

}

class Doctor implements Person, Mammal {
	public void talk() {
		System.out.println("Doctor is talking");
	}
}

package lecture9;

public class Home {

	public static void main(String[] args) {
		Person siva = new Person("siva");
		new Thread(() -> siva.talk()).start();
		//new Thread(() -> siva.see()).start();
		new Thread(() -> siva.eat()).start();
		//Person charu = new Person("Charu");
		//new Thread( () -> charu.eat()).start();
		//new Thread( () -> charu.talk()).start();
		
	}

}

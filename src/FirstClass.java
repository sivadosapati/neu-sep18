
class FirstClass {
	public static void main(String args[]) {
		System.out.println("I love NEU");
		Weather weather = new Weather();
		for (int i = 0; i < 10; i++) {
			if (weather.isRaining()) {
				System.out.println("It's raining");
			} else {
				System.out.println("It's not raining");
			}
		}
		if(weather.isCold()) {
			System.out.println("Cold");
		}
	}
}

class Weather {
	boolean isRaining() {
		Randomizer randomizer = new Randomizer();
		int x = randomizer.getRandom(10);
		if (x < 5)
			return true;
		return false;
	}
	
	boolean isWarm() {
		return true;
	}
	
	boolean isCold() {
		return true;
	}

	public static void main(String args[]) {
		System.out.println("Weather is nice");
	}
}

class Randomizer {
	int getRandom(int x) {
		return (int) (Math.random() * x);
	}
}
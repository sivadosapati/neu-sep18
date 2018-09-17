package lecture2;

import java.util.Scanner;

enum Gender {
	male, FEMALE;
}

/*class PersonGender{
	static final String MALE = "Male";
	static final String FEMALE = "Female";
}*/

public class Parent {
	Kid[] kids;

	float getTotalPriceForIPhones() {
		float totalPrice = 0;
		for (int i = 0; i < kids.length; i++) {
			totalPrice = totalPrice + kids[i].iphonePrice;
		}
		return totalPrice;
	}

	float getTotalPriceForIPhonesForAParticularGender(Gender gender) {
		float totalPrice = 0;
		for (int i = 0; i < kids.length; i++) {
			Kid k = kids[i];
			if (k.gender == gender)
				totalPrice = totalPrice + kids[i].iphonePrice;
		}
		return totalPrice;

	}

	public static void main(String[] args) {
		// calculatePrice();
		calculatePriceUsingConsole();
		calculatePriceUsingConsoleForAParticularGender();
	}

	private static void calculatePriceUsingConsole() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of kids..");
		Parent p = new Parent();
		int n = scanner.nextInt();
		p.kids = new Kid[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the iphone price for kid # " + (i + 1));
			float price = scanner.nextFloat();
			Kid k = new Kid();
			k.iphonePrice = price;
			p.kids[i] = k;

		}
		System.out.println(p.getTotalPriceForIPhones());

	}

	static Gender getGender(String string) {
		if (string.equals("M")) {
			return Gender.male;
		}
		if (string.equals("F")) {
			return Gender.FEMALE;
		}
		throw new RuntimeException("Gender has to be either M or F");

	}

	private static void calculatePriceUsingConsoleForAParticularGender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of kids..");
		Parent p = new Parent();
		int n = scanner.nextInt();
		p.kids = new Kid[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Eneter the gender for kid # (M for Male and F for Female)" + (i + 1));
			String s = scanner.next();
			Gender g = getGender(s);
			System.out.println("Enter the iphone price for kid # " + (i + 1));
			float price = scanner.nextFloat();
			Kid k = new Kid();
			k.iphonePrice = price;
			k.gender = g;
			p.kids[i] = k;
		}
		System.out.println(
				"Tell me the gender for which you are planning to calculate the price (M for Male|F for Female)");
		String s = scanner.next();
		Gender g = getGender(s);
		System.out.println(p.getTotalPriceForIPhonesForAParticularGender(g));

	}

	private static void calculatePrice() {
		Parent p = new Parent();
		p.kids = new Kid[2];
		p.kids[0] = new Kid();
		p.kids[1] = new Kid();
		p.kids[0].iphonePrice = 499;
		p.kids[1].iphonePrice = 599;
		System.out.println("Total Price - > " + p.getTotalPriceForIPhones());

	}

}

class Kid {
	float iphonePrice;
	Gender gender;
}

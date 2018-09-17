package lecture2;

public class Car {
	float price;
	// Color color;
	float weight;
	// CarBrand brand;
	String brand = "Honda";
	CarModel model;
	String color;
	String interiorColor = "Black";

	public static void main(String args[]) {
		Car sivaCar = new Car();
		sivaCar.price = 35000.50F;
		sivaCar.brand = "Acura";
		//sivaCar.model = "TSX";
		CarModel model = new CarModel();
		model.name = "TSX";
		sivaCar.color = "Grey";
		
		sivaCar.color = new String("Grey");
	}
}

class Color {
	char[] name;
}

class CarBrand {
	char[] name;
}

class CarModel {
	String name;
}
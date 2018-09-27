package lecture3;

public class iPhone {
	private double price;
	private int memory;
	private String color;
	private double weight;
	private int version;
	private String number;

	public void makePhoneCall(iPhone iPhone) {
		System.out.println(this.getNumber() + " is making a phone call to -> " + iPhone.getNumber());
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void receivePhoneCall(iPhone iPhone) {
		System.out.println(this.getNumber() + "is receiving phone call from -> " + iPhone.getNumber());
	}

	public static void main(String args[]) {
		iPhone sivaPhone = new iPhone();
		sivaPhone.setNumber("425-283-7905");
		iPhone6 divyaPhone = new iPhone6();
		divyaPhone.setNumber("206-222-1111");
		divyaPhone.setTakeVideos(false);
		divyaPhone.makePhoneCall(sivaPhone);
	}

}

class iPhone6 extends iPhone {

	private boolean takeVideos;
	private boolean printCapability;

	public boolean isTakeVideos() {
		return takeVideos;
	}

	public void setTakeVideos(boolean takeVideos) {
		this.takeVideos = takeVideos;
	}

	public boolean isPrintCapability() {
		return printCapability;
	}

	public void setPrintCapability(boolean printCapability) {
		this.printCapability = printCapability;
	}

}

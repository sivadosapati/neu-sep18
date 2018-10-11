package lecture5.exception.handling;

class DoorNotClosingException extends RuntimeException {

}

public class Home {

	public static void main(String[] args) throws Exception {
		Friend mihir = new Friend();
		try {
			Groceries g = mihir.getGroceries();
			System.out.println(g);
			// closeDoor();

		} catch (NoMoneyException e) {
			if (e.price > 5 && e.price < 20) {
				System.out.println("Get groceries for only $20");
				System.out.println(mihir.getGroceries(20));
				// closeDoor();
				return;
			}
			// e.printStackTrace();
			System.out.println("Couldn't get Groceries for " + e.price);
		} catch (RunOutOfGasException re) {
			System.out.println("Mihir ran out of gas and I'm trying with Vineeth");
			Friend vineeth = new Friend();
			System.out.println(vineeth.getGroceries());
			// closeDoor();

		} finally {
			closeDoor();
		}

	}

	private static void closeDoor() {
		int x = new Friend().getRandom(10);
		if (x > 2)
			throw new DoorNotClosingException();
		System.out.println("Closing door");
	}

}

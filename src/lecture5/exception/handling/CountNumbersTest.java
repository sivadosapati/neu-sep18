package lecture5.exception.handling;

import java.util.Scanner;

public class CountNumbersTest {

	public static void main(String[] args) throws Exception {

		/*
		 * try { countNumbers(); } catch (Exception e) {
		 * System.out.println("Unfortunately - I couldn't count numbers"); }
		 */
		countNumbers();

	}

	private static void countNumbers() throws Exception {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int counter = 0;
		while (true) {
			try {
				counter++;
				System.out.println("Enter the total numbers to be added..");
				a = Integer.parseInt(scanner.nextLine());
				System.out.println("Thank you for giving me a number -> " + a);
				break;
			} catch (Exception e) {
				if (counter == 3) {
					throw e;
				}
				System.out.println("Please enter a number. I can only take numbers");
				continue;
			}
		}
		int count = 1;
		int sum = 0;
		while (count <= a) {
			System.out.println("Enter Number # " + count);
			sum = sum + scanner.nextInt();
			count++;

		}
		System.out.println("Sum = " + sum);

	}

}

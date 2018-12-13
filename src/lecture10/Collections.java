package lecture10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
		// printNamesUsingTraditionalWay();
		printNamesUsingStreams();
	}

	private static void printNamesUsingStreams() {
		List<String> names = Arrays.asList("Siva", "George", "John");
		names.stream().filter((e) -> isNameHavingCharacters(e, 4)).filter((e) -> e.startsWith("S"))
				.forEach((name) -> System.out.println(name));

		int sum = names.stream().mapToInt((e) -> e.length()).sum();
		System.out.println(sum);
		System.out.println("------");

		names.forEach(System.out::println);
	}

	private int sum(List<String> names) {
		int sum = 0;
		for (String name : names) {
			sum = sum + name.length();
		}
		return sum;
	}

	private static boolean isNameHavingCharacters(String name, int length) {
		return name.length() == length;
	}

	private static void printNamesUsingTraditionalWay() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Siva");
		names.add("John");
		names.add("George");
		for (String name : names) {
			System.out.println(name);
		}
	}

}

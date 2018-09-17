package lecture2;

public class NumbersFun {

	public static void main(String[] args) {
		NumbersFun nf = new NumbersFun();
		System.out.println(nf.countNumbersForNonMultiplesForThreeWithMaximumAsThirteen(100));
		// 1 2 4 5 7 8 10

	}

	int countNumbersForNonMultiplesForThreeWithMaximumAsThirteen(int lastNumber) {
		int count = 0;
		for (int i = 1; i <= lastNumber; i++) {
			if (i % 3 == 0) {
				continue;
			}
			if (i == 13) {
				break;
			}
			count += i;
		}
		return count;
	}

}

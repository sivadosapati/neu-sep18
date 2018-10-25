package lecture7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FileReadTimes {

	public static void main(String[] args) throws Exception {
		String file = "/Users/sdosapati/big.txt";
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis, 8192 * 1000);
		long time = readFromInputStream(fis);
		System.out.println("Time taken with FIS -> " + time);
		time = readFromInputStream(bis);
		System.out.println("Time taken with BIS -> " + time);

	}

	private static long readFromInputStream(InputStream fis) throws Exception {
		long start = System.nanoTime();
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
		}
		long end = System.nanoTime();
		return end - start;
	}

}

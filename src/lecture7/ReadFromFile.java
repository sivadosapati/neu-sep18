package lecture7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file from where you would like to read");
		String fileName = scanner.nextLine();

		File file = new File(fileName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// readFromFileOneByteAtATime(fis);
			ReadFromFile rff = new ReadFromFile();
			rff.readFromFileAllTheBytesInOneShot(fis);
		} finally {
			if (fis != null)
				fis.close();
		}

	}

	private void readFromFileAllTheBytesInOneShot(FileInputStream fis) throws IOException {
		int x = fis.available();
		byte b[] = new byte[x];
		fis.read(b);
		String data = new String(b);
		System.out.println(data);

	}

	private static void readFromFileOneByteAtATime(FileInputStream fis) throws IOException {
		while (true) {
			int x = fis.read();
			if (x == -1)
				break;
			char ch = (char) x;
			System.out.print(ch);
		}

	}

}

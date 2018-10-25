package lecture7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FindWordInFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file from where you would like to read and find the word");
		String fileName = scanner.nextLine();
		System.out.println("Tell me the word you are looking for in this file");
		String word = scanner.nextLine();
		File file = new File(fileName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// readAllContentInFileAndFindTheWord(word, fis);
			readALineFromTheFileAndFindTheWord(word, fis);
		} finally {
			if (fis != null)
				fis.close();
		}

	}

	private static void readALineFromTheFileAndFindTheWord(String word, FileInputStream fis) {
		Scanner scanner = new Scanner(fis);
		String found = "NO";
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(word)) {
				found = "YES";
				break;
			}
		}
		System.out.println(found);

	}

	private static void readAllContentInFileAndFindTheWord(String word, FileInputStream fis) throws IOException {
		// readFromFileOneByteAtATime(fis);
		String content = readFromFileAllTheBytesInOneShot(fis);
		if (content.contains(word)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static String readFromFileAllTheBytesInOneShot(FileInputStream fis) throws IOException {
		int x = fis.available();
		byte b[] = new byte[x];
		fis.read(b);
		String data = new String(b);
		return data;

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

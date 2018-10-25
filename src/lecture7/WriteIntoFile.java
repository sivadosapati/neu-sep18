package lecture7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteIntoFile {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file into which you would like to write");
		File file = new File(scanner.nextLine());
		System.out.println(
				"Enter the content that you would like to write in the file. After you are done, type EXIT in the new line");
		FileOutputStream fos = new FileOutputStream(file, true);
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("EXIT")) {
				break;
			}
			fos.write((line + "\n").getBytes());
			
		}
		fos.close();

	}

}

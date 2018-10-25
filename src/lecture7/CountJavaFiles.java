package lecture7;

import java.io.File;
import java.util.Scanner;

public class CountJavaFiles {

	public static void main(String[] args) {
		String extension = ".java";
		Scanner scanner = new Scanner(System.in);
		String filePath = "";
		System.out.println("Enter the Directory where you would like to count the java files");
		filePath = scanner.nextLine().trim();

		File file = new File(filePath);
		if (file.isDirectory()) {
			System.out.println("Number of Files with " + extension + " in directory " + filePath + " = "
					+ countFiles(file, extension));
		} else {
			System.out.println(file.getAbsolutePath() + " is not a directory");
		}
	}

	private static int countFiles(File file, String extension) {
		File children[] = file.listFiles();
		int count = 0;
		for (File a : children) {
			if (a.isDirectory()) {
				count = count + countFiles(a, extension);
				continue;
			}
			if (a.getAbsolutePath().endsWith(extension)) {
				count++;
			}
		}
		return count;
	}

}

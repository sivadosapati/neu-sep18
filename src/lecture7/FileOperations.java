package lecture7;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/sdosapati/abc.txt");
		file.createNewFile();

		file = new File("/Users/sdosapati/abc/xyz/123");
		file.mkdirs();

	}

}

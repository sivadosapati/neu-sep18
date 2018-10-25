package lecture7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lecture6.Student;

public class ReadAndWriteObjects {

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/sdosapati/student_objects.txt");
		read(file);
		//write(file);
	}

	private static void read(File file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Student s = (Student) o;
		System.out.println(s.toString());

	}

	private static void write(File file) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(file);
		Student s = new Student();
		s.setRollNumber(100);
		s.setFirst("Arya");
		s.setLast("Soman");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
	}

}

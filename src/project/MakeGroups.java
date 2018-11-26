package project;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MakeGroups {

	public static void main(String[] args) throws Exception {
		ArrayList<String> students = new ArrayList<String>();
		Scanner scanner = new Scanner(new FileInputStream(new File("lectures/students")));
		while (scanner.hasNextLine()) {
			students.add(scanner.nextLine().split("\\,")[0]);
		}
		for (String student : students) {
			// System.out.println(student);
		}
		// System.out.println("------");
		int group = 1;
		int teamIndex = 0;
		int team = 1;
		int count = 0;
		while (true) {
			count++;
			teamIndex++;
			if (students.size() == 0)
				break;
			int x = (int) (Math.random() * students.size());
			String student = students.remove(x);
			System.out.println(student);
			if (teamIndex == 4) {
				System.out.println("-------------");
				teamIndex = 0;
			}
			if (count == 24) {
				System.out.println("####################");
			}

		}

	}

}

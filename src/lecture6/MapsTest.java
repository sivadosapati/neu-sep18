package lecture6;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {

	public static void main(String[] args) {
		workOnMaps();

	}

	private static void workOnMaps() {
		Map<Integer, Student> studentsMap = new HashMap<Integer,Student>();
		Student a = new Student(100, "John", "Holt");
		Student b = new Student(101, "Divya", "Sharma");
		Student c = new Student(102, "Siva", "Kumar");
		Student d = new Student(100, "John", "Holt");
		studentsMap.put(c.getRollNumber(),c);
		studentsMap.put(b.getRollNumber(),b);
		studentsMap.put(a.getRollNumber(),a);
		studentsMap.put(d.getRollNumber(),d);
		System.out.println(studentsMap);
		System.out.println(studentsMap.containsKey(105));
		System.out.println(studentsMap.get(100));
		System.out.println(studentsMap.size());

		
	}

}

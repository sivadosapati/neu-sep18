package lecture3;

public class Student {
	// "I live in Seattle. I'm loving it"
	//"Mr Siva Kumar"
	//"Miss Divya George"
	
	public boolean startsAndEndsWith(String string, String start, String end) {
		boolean a = string.startsWith(start);
		boolean b = string.endsWith(end);
		return a && b;
	}

	public int countWordsWithoutAbstraction(String string) {
		char[] ch = string.toCharArray();
		int words = 0;
		for (char c : ch) {
			if (c == ' ') {
				words++;
			}
		}
		return words + 1;

	}

	public int countWords(String string) {
		String words[] = string.trim().split("\\s++");
		return words.length;
	}

	public static void main(String[] args) {
		Student s = new Student();
		String str = " I am    talking    to students ";
		System.out.println(s.countWordsWithoutAbstraction(str));
		System.out.println(s.countWords(str));

	}

}

package program.array;

import java.util.HashSet;

public class DuplicateArrays {

	public static void main(String[] args) {
		String str[] = { "A", "B", "C", "D", "E", "R", "F", "D", "S", "G", "F", "S", "D" };
		HashSet<String> set = new HashSet<String>();
		for (String string : str) {
			if (!set.add(string)) {
				System.out.println("Duplicate:" + string);
			}

		}
	}



}

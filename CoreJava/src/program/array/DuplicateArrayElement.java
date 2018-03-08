package program.array;

public class DuplicateArrayElement {

	public static void main(String[] args) {
		String[] str = { "A", "B", "C", "C", "D", "F", "A" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && (i != j)) {
					System.out.println("duplicate:" + str[j]);
				}

			}

		}

	}

}

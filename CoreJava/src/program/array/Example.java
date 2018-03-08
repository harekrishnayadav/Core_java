package program.array;

public class Example {

	public static void main(String[] args) {
		String str = "JAVAJ2EE";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(ch[j] + " ");

			}
			System.out.println();

		}

	}

}

package program;

public class ReverseString {

	public static void main(String[] args) {
		String sb = "Java";
		char[] ch = sb.toCharArray();
		for (int i = sb.length() - 1; i >= 0; i--) {
			System.out.print( ch[i]);

		}

	}

}

package exception.trycatch;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		String str[] = { "Abc", "sdr", "asdf" };
		for (int i = 0; i < str.length; i++) {
			int a = str[i].length() + Integer.parseInt(str[i]);
			System.out.println(a);

		}
	}

}

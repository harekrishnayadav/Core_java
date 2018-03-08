package exception.trycatch;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		String[] str = { "abc", "dre", "rjs", "123", "abc" };
		for (int i = 0; i < str.length; i++) {
			System.out.println("str:" + str[i]);
			try {
				System.out.println("Before convert");
				int Intval = Integer.parseInt(str[i]);
				System.out.println("Value :" + Intval);
				System.out.println(" After Try block");

			} catch (NumberFormatException e) {
				System.out.println("Catch block");
			} finally {
				System.out.println("finally block");
			}

		}

	}

}

package exception.trycatch;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int x = 10 / 0;
			System.out.println("try");

		} catch (ArithmeticException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}

}

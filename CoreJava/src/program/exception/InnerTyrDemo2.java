package program.exception;

public class InnerTyrDemo2 {

	public static void main(String[] args) {
		try {
			System.out.println("outer try");
			System.out.println(10 / 0);
			try {
				System.out.println("inner try");

			} catch (ArithmeticException ae) {
				System.out.println("inner catch");
			}
		} catch (ArithmeticException ae) {
			System.out.println("outer catch");
		}
	}

}

package program.exception;

public class InnerTryDemo1 {

	public static void main(String[] args) {
		System.out.println(10 / 0);
		try {
			System.out.println("Outer try");
			try {
				System.out.println("inner try");

			} catch (ArithmeticException ae) {
				System.out.println("inner catch");
			}
			System.out.println("after catch");
		} catch (ArithmeticException ae) {
			System.out.println("outer catch");
		}
	}

}

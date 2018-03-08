package program.exception;

public class InnerTryDemo4 {

	public static void main(String[] args) {
		try {
			System.out.println("outer try ");
			try {
				System.out.println("inner try");
				System.out.println(10 / 0);
			} catch (NumberFormatException ne) {
				System.out.println("inner catch");
			}
		} catch (ArithmeticException ae) {
			System.out.println("outer catch");
		}
	}

}

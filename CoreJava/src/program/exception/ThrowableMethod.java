package program.exception;

public class ThrowableMethod {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("getMethod() method output");
			System.out.println(ae.getMessage());
			System.out.println("============================");
			System.out.println("toStrng() method");
			System.out.println(ae.toString());
			System.out.println("============================");
			System.out.println("printStackTrace()method");
			ae.printStackTrace();
			System.out.println("==============");
			System.out.println("JVM default output");

		}

	}

}

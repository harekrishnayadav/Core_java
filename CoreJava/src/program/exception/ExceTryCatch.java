package program.exception;

public class ExceTryCatch {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println(c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("pass value");

		} catch (NumberFormatException n) {
			System.out.println("number formart");
		} catch (ArithmeticException a) {
			System.out.println("arth");
		}

	}

}

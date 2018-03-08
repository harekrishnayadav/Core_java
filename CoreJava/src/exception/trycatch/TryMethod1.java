package exception.trycatch;

public class TryMethod1 {

	public static void main(String[] args) {

		System.out.println(m1());

	}

	static int m1() {
		try {
			System.out.println("try");
			System.out.println(10 / 0);

		} catch (ArithmeticException e) {
			System.out.println("catch");
		} finally {
			if (false) {
				return 40;
			}

		}
		return 20;

	}

}

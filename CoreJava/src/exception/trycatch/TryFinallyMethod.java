package exception.trycatch;

public class TryFinallyMethod {

	public static void main(String[] args) {
		System.out.println(method1());

	}

	static int method1() {
		try {
			System.out.println("");
			return 10;

		} finally {
			System.out.println("finally");
			return 20 / 0;
		}
		// return 20;
	}

}

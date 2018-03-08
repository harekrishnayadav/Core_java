package exception.trycatch;

public class TryWhile2 {

	public static void main(String[] args) {
		System.out.println(m1());

	}

	private static int m1() {
		try {
			int i = 0;
			while (++i <= 5) {
				System.out.println(i / 0);
				System.out.println("try");
				break;
			}
		} finally {
			System.out.println("finally");
		}
		/*
		 * catch (Exception e) { System.out.println("catch"); }
		 */
		return 20;
	}

}

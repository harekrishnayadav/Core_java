package exception.trycatch;

public class TryMethodRetun {

	public static void main(String[] args) {

		System.out.println(m1());

	}

	static int m1() {

		try {
			int i = 1;
			try {
				System.out.println("inner Try");

				return i / 0;

			} finally {
				System.out.println("finally");
				return i / 0;

			}

		} catch (Exception e) {
			System.out.println("catch");

		} finally {
			int i = 30;
			return i;
		}

	}

}

package exception.trycatch;

public class TryBreak2 {

	public static void main(String[] args) {
		System.out.println(m1());

	}

	private static int m1() {

		int i = 0;
		while (++i == 5) {
			try {
				// return 10 / 0;

				System.out.println(10 / 0);

			} finally {
				break;

			}

		}
		return 20;
	}

}

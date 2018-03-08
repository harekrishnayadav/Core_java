package exception.trycatch;

public class TryWhile {

	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(m1());
		System.out.println("After method");

	}

	static int m1() {
		System.out.println("m1 start");
		int i = 0;
		while (++i <= 5) {
			System.out.println("While statrt i:" + i);
			try {
				System.out.println("in try i: " + i);
				return 10/0;

			} finally {
				System.out.println("finally");
				break;

			}

		}
		return 20;
	}

}

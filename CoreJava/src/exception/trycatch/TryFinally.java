package exception.trycatch;

public class TryFinally {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			int a = 10 / 0;
		} finally {
			System.out.println("finally");
		}
		System.out.println("after finally");

	}

}

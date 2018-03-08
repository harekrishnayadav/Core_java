package exception.trycatch;

public class NormalTRyCatch {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			int a = 10 / 0;

		} catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");

		}

	}

}

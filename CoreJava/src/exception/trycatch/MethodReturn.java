package exception.trycatch;

public class MethodReturn {

	public static void main(String[] args) {
		System.out.println(maethodReturn());

	}

	private static int maethodReturn() {
		try {
			System.out.println("try");
			int x=10/0;
			return 10;

		} catch (Exception e) {
			System.out.println("catch");
			return 20;
		} finally {
			
			return 30;
		}
	}

}

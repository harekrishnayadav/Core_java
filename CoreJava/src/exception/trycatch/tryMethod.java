package exception.trycatch;

public class tryMethod {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	static int m1() {
		try {
			System.out.println("try");
			return 10 / 0;

		} catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			return 20;
		}
		

	}
	

}

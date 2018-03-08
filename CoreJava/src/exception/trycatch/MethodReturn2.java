package exception.trycatch;

public class MethodReturn2 {

	public static void main(String[] args) {
		System.out.println(methoReturn());

	}

	private static int methoReturn() {
		int i = 0;
		try {
			i = 1;
			// return i;
			try {
				i = 4;
				return i;

			} catch (Exception e) {

			} finally {
				//i = 5;
				return i;
			}
		} catch (Exception e) {
			i = 2;
			return i;
		} finally {
			//i = 3;
			return i;
		}

	}

}

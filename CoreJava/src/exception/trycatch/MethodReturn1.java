package exception.trycatch;

public class MethodReturn1 {

	public static void main(String[] args) {
		System.out.println(methodreturn());

	}

	private static String methodreturn() {
		String s = null;
		int i = 0;
		try {
			s = "Hi ,This is try block";
			i = 10;
			return s + "" + i;
		} catch (Exception e) {

			s = s + "Hi,This is catch block";
			return s;
		} finally {
			s = "Hi,This is finally block";
			// return s;
		}

	}

}

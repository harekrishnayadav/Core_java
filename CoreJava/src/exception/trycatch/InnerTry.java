package exception.trycatch;

public class InnerTry {

	public static void main(String[] args) {
		String str[] = { "abc", "dfr", "udgf", "123", "sda", null };
		for (int i = 0; i < str.length; i++) {
			System.out.println("str:" + str[i]);
			try {
				System.out.println("Outer try");
				int a = str[i].length();
				System.out.println("A:" + a);
				try {
					System.out.println("inner try");
					a = Integer.parseInt(str[i]);
					System.out.println("A:" + a);

				} catch (NumberFormatException e) {
					System.out.println("number formate and inner catch");
				}

			} catch (NullPointerException e) {
				System.out.println("null pointer and out catch");
			}

		}

	}

}

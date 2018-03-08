package exception.trycatch;

public class tryExit {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);
		} finally {

			System.out.println("finanlly");
		}

	}

}

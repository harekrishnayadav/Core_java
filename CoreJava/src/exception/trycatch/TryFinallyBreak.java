package exception.trycatch;

public class TryFinallyBreak {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("\nIn Loop:" + i);
			try {
				System.out.println(" In try");
				if (i == 5) {
					break;
					// continue;
				}

			} finally {
				System.out.println("finally");
			}

		}

	}

}

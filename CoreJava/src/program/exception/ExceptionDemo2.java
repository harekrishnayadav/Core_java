package program.exception;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println("A: " + a + " B:" + b);
			int c = a / b;
			System.out.println("Result:" + (a + b));

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Result::" + (a + b));
		} catch (NumberFormatException e) {

		}

	}

}

package program.exception.mobile;

import java.util.Scanner;

public class InputMultiple {

	public static void main(String[] args) {
       System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Multiple(input);
	}

	private static void Multiple(int input) {
		for (int i = 0; i <= input; i++) {
			if (i % (3*5) == 0) {
				System.out.println("Hi");

			} else if (i % 3 == 0) {
				System.out.println("Hello");

			} else if (i % 5 == 0) {
				System.out.println("HiHello");

			} else {
				System.out.println(i);
			}

		}

	}

}

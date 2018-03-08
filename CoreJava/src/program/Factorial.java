package program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		System.out.println("Factorial:" + factorial(n));

	}

	private static int factorial(int n) {
		int num = 1;
		int sum = 0;
		while (n > 0) {
			sum = sum + num;

			num = num * n;

			n--;
		}
		System.out.println("sum:" + sum);
		return num;
	}

}

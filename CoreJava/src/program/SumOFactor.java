package program;

import java.util.Scanner;

public class SumOFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter even Number");
		int n = sc.nextInt();
		SumoFfactors(n);

	}

	private static void SumoFfactors(int n) {
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;

			}

		}
		System.out.println("sum of factor:" + sum);

	}

}

package program;

import java.util.Scanner;

public class BinaryNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No.");
		int n = sc.nextInt();
		//int n=10101;
		System.out.println(isBinary(n) ? n + "  is  BinaryNumber" : n + "isNotBinaryNumber");

	}

	private static boolean isBinary(int n) {
		while (n != 0) {
			if (n % 10 > 1) {
				return false;
			}
			n=n/10;
		}
		return true;
	}

}

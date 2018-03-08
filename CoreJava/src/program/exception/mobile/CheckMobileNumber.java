package program.exception.mobile;

import java.util.Scanner;

public class CheckMobileNumber {

	public static void main(String[] args) {
		System.out.println("Enter Mobile Number");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (Utility.numberOrNot(input) && (input.length() == 10)) {
			System.out.println("Good!!! You have entered valid mobile number");
		} else {
			System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
		}

	}

}

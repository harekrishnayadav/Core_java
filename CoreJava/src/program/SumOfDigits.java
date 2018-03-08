package program;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 123;
		int sum = SumOfDigit(n);
		System.out.println("sum:" + sum);

	}

	private static int SumOfDigit(int n) {
		int sum = 0;
		int r;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;

	}

}

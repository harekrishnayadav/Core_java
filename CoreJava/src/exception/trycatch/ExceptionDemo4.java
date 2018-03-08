package exception.trycatch;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// int a = Integer.parseInt(args[0]);
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("a:" + a);
			try {
				System.out.println("before try");
				int[] x = new int[a];
				System.out.println("after try");
				System.out.println("Array size:" + x.length);

			} catch (NegativeArraySizeException e) {
				System.out.println("before catch");
				int[] x = new int[3];
				System.out.println("array size:" + x.length);
			}
			int b = a = 20;
			System.out.println("b:" + b);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer catch");
		}

	}

}

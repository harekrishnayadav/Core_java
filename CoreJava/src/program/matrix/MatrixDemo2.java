package program.matrix;

public class MatrixDemo2 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		print2d(matrix);
	}

	private static void print2d(int[][] matrix) {
		for (int[] is : matrix)

			for (int ib : is) {
				System.out.print(ib + " ");
			}
	}

}

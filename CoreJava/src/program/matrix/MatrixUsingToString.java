package program.matrix;

import java.util.Arrays;

public class MatrixUsingToString {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		print2d(matrix);
	}

	private static void print2d(int[][] matrix) {
		for (int[] is : matrix) {
			System.out.println(Arrays.toString(is));
		}

	}

}

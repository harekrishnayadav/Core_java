package com.matrx;

import java.util.Scanner;

public class MatrixApp1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = s.nextInt();
		System.out.println("Enter the columns");
		int columns = s.nextInt();
		System.out.println("Enter the data");
		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int s1 = matrix[i][j] = s.nextInt();
				// System.out.print(s1);

			}

		}
		System.out.println("ur matrix is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");

			}
			System.out.println();
		}

	}

}

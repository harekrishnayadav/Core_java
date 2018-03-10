package com.matrx;

import java.util.Scanner;

public class MatrixDemo1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row:");
		int rows = s.nextInt();
		System.out.print("Enter the columns:");
		int columns = s.nextInt();
		// System.out.println("row:" + rows + " " + " columns:" + columns);
		int[][] matrix1 = new int[rows][columns];
		int[][] matrix2 = new int[rows][columns];
		System.out.println("Enter first matrix elemnt:");
		for (int i = 0; i < rows; i++) {
			System.out.println("i:" + i);
			for (int j = 0; j < columns; j++) {
				System.out.println("j:" + j);
				matrix1[i][j] = s.nextInt();
				System.out.print(+matrix1[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("Enter second matrix element:");
		for (int i = 0; i < rows; i++) {
			System.out.println("i:" + i);
			for (int j = 0; j < columns; j++) {
				System.out.println("j:" + j);
				matrix2[i][j] = s.nextInt();
				System.out.print(+matrix2[i][j] + " ");

			}
			System.out.println();

		}

	}

}

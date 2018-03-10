package com.matrx;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row:");
		int r = s.nextInt();
		System.out.println("Enter the colmuns:");
		int c = s.nextInt();
		int[][] m1 = new int[r][c];
		int[][] m2 = new int[r][c];
		int[][] sumM = new int[r][c];
		System.out.println("Enter the first matrix element:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m1[i][j] = s.nextInt();

			}

		}
		System.out.println("Enter the second matrix element: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m2[i][j] = s.nextInt();

			}

		}
		System.out.println("Addition: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sumM[i][j] = m1[i][j] + m2[i][j];

			}

		}
		System.out.println("M1: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m1[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("M2: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m2[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("Sum: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(sumM[i][j] + "\t");
			}
			System.out.println();

		}
	}

}

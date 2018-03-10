package com.matrx;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("row:");
		int r = s.nextInt();
		System.out.println("columns:");
		int c = s.nextInt();
		int[][] m1 = new int[r][c];
		int[][] m2 = new int[r][c];
		int[][] m3 = new int[r][c];
		int sum = 0;
		System.out.println("m1 element:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m1[i][j] = s.nextInt();

			}

		}
		System.out.println("m2 element:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				m2[i][j] = s.nextInt();

			}

		}
		System.out.println("m1 element:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				for (int k = 0; k < 2; k++) {
					m3[i][j] = m3[i][j] + m1[i][k] * m2[k][j];

				}

			}

		}
		System.out.println("m1 matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m1[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println("m2 matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m2[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println("m3 matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(m3[i][j] + "\t");

			}
			System.out.println();

		}

	}

}

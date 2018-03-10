package com.matrx;

import java.util.Scanner;

public class SubtractMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows = s.nextInt();
		System.out.println("Enter the columns:");
		int col = s.nextInt();
		int[][] m1 = new int[rows][col];
		int[][] m2 = new int[rows][col];
		int[][] m3 = new int[rows][col];
		System.out.println("Enter the first matrix element:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				m1[i][j] = s.nextInt();

			}

		}

		System.out.println("Enter the second matrix element:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				m2[i][j] = s.nextInt();

			}

		}
		System.out.println("Subtract of matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				m3[i][j] = m1[i][j] - m2[i][j];

			}

		}
		System.out.println(" first matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m1[i][j] + "\t");

			}
			System.out.println();
		}
		System.out.println("second Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m2[i][j] + "\t");

			}
			System.out.println();

		}
		System.out.println("subtract:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(m3[i][j] + "\t");

			}
			System.out.println();

		}

	}

}

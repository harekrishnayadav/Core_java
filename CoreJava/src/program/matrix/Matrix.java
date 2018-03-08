package program.matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row ");
		int row = sc.nextInt();
		System.out.println("Enter column");
		int column = sc.nextInt();
		
		int[][] matrix = new int[row][column];
		for (int i = 0; i <matrix.length; i++) {
			for (int j = 0; j <matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println(" ");

		}
	}

}

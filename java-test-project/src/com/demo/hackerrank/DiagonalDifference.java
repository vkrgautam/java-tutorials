package com.demo.hackerrank;

import java.util.Scanner;

/**
 * Print the absolute difference between the sums of the matrix's two diagonals
 * as a single integer.
 * 
 * @author GautamV
 *
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		/**
		 * Input: 11 2 4 4 5 6 10 8 -12
		 * Output: 15
		 */
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					sum1 += arr[i][j];
				}
				if (i + j == arr.length - 1) {
					sum2 += arr[i][j];
				}
			}
		}
		System.out.println("Diagonal Difference : " + Math.abs(sum1 - sum2));
	}
}

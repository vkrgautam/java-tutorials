package com.test.number;

import java.util.Scanner;

/**
 * Print Perfect Squares In The Given Range
 * 
 * @author GautamV
 *
 */
public class NumberOfPerfectSquares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();

		int count = 0;

		for (int i = (int) Math.sqrt(start); i <= (int) Math.sqrt(end); i++) {
			if (i * i >= start && i * i <= end) {
				count++;
			}
		}
		System.out.println("count is " + count);
	}
}

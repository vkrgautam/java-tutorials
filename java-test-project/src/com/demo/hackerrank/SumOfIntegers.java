package com.demo.hackerrank;

/**
 * For a given number n > 0, find the number of different ways in which n can be
 * written as a sum of at two or more positive integers.
 * 
 * @author GautamV
 *
 */
public class SumOfIntegers {

	public static void main(String[] args) {
		int n = 6;
		System.out.print(countWays(n));
	}

	static int countWays(int n) {
		int table[] = new int[n + 1];
		table[0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++) {
				table[j] += table[j - i];
			}
		}
		return table[n];
	}
}

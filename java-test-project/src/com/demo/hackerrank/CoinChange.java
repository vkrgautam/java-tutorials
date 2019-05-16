package com.demo.hackerrank;

/**
 * Given a value N, if we want to make change for N cents, and we have infinite
 * supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we
 * make the change? The order of coins doesn't matter.
 * 
 * @author GautamV
 *
 */
public class CoinChange {

	public static void main(String[] args) {
		// N = 4 and S = {1,2,3}
		int arr[] = { 1, 2, 3 };
		// 1,1,1,1,1 - 1,1,1,2 - 1,1,3 - 2,3 - 1,2,2
		int m = arr.length;
		int n = 5;
		System.out.println(countWays(arr, m, n));
	}

	static long countWays(int S[], int m, int n) {
		/**
		 * table[i] will be storing the number of solutions for value i. We need n+1
		 * rows as the table is constructed in bottom up manner using the base case (n =
		 * 0)
		 */
		long[] table = new long[n + 1];

		// Base case (If given value is 0)
		table[0] = 1;

		/**
		 * Pick all coins one by one and update the table[] values after the index
		 * greater than or equal to the value of the picked coin
		 */
		for (int i = 0; i < m; i++) {
			for (int j = S[i]; j <= n; j++) {
				table[j] += table[j - S[i]];
			}
		}
		return table[n];
	}
}

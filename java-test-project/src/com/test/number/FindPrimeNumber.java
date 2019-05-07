package com.test.number;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean notPrimeFlag = Boolean.FALSE;
		/**
		 * Note: 0 and 1 are not prime numbers. 2 is the only even prime number because
		 * all the other even numbers can be divided by 2.
		 */
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				notPrimeFlag = Boolean.TRUE;
				break;
			}
		}
		if (notPrimeFlag) {
			System.out.println("Number " + num + " is not prime number.");
		} else {
			System.out.println("Number " + num + " is a prime number.");
		}
	}
}

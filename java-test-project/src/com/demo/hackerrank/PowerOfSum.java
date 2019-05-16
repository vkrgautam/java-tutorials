package com.demo.hackerrank;

import java.util.Scanner;

/**
 * Write a program that takes argument l and r and returns the number of Power
 * Numbers found between l and r. Power number is a number that can be represented
 * as the sum of two powers.
 * 
 * @author GautamV
 *
 */
public class PowerOfSum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();
		int n = countPowerNumbers(l, r);
		System.out.println(n);
	}
	
	static int countPowerNumbers(int l, int r) {
		int count = 0;
		
		return count;
	}
}

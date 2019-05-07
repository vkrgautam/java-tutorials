package com.test.logic;

import java.util.Scanner;

/**
 * 
 * @author GautamV
 *
 */
public class CheckLeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		System.out.println(isLeapYear(year) ? "Leap year!" : "Not a leap year!");
	}

	static boolean isLeapYear(int year) {
		// If a year is multiple of 400, then it is a leap year
		if (year % 400 == 0)
			return true;
		// Else If a year is multiple of 100, then it is not a leap year
		if (year % 100 == 0)
			return false;
		// Else If a year is multiple of 4, then it is a leap year
		if (year % 4 == 0)
			return true;

		return false;
	}
}

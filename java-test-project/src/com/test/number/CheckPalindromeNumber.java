package com.test.number;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int num = 12321;
		int r, sum = 0, temp;

		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not Palindrome Number");
		}
	}
}

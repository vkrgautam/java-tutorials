package com.demo.string;

import java.util.Scanner;

/**
 * Given a string s, and an integer k, complete the function so that it finds
 * the lexicographically smallest and largest substrings of length k.
 * 
 * @author GautamV
 */
public class SubstringDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		for (int i = 0; i <= s.length() - k; i++) {
			String subString = s.substring(i, i + k);
			if (i == 0) {
				smallest = subString;
			}
			if (subString.compareTo(largest) > 0) {
				largest = subString;
			} else if (subString.compareTo(smallest) < 0)
				smallest = subString;
		}
		return smallest + "\n" + largest;
	}
}

package com.test.string;

public class CheckPalindromeString {

	public static void main(String[] args) {

		String str = "abcba";
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("Palindrome Strings");
		} else {
			System.out.println("Not Palindrome Strings");
		}
	}

}

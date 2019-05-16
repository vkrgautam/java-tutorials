package com.demo.ut;

import java.util.Arrays;

public class StringChecks {

	public boolean isPalindromeString(String str) {
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return str.equalsIgnoreCase(revStr) ? true : false;
	}

	public boolean isAnagramStrings(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			return Arrays.equals(ArrayS1, ArrayS2) ? true : false;
		}
	}
}

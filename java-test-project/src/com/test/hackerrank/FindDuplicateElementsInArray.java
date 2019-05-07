package com.test.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {

		String strArr[] = new String[] { "abc", "def", "ghi", "abc", "jkl", "mno", "ghi", "pqr" };

		// loop over an array and compare each element to every other element.
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i] == strArr[j]) {
					System.out.print(strArr[i] + " ");
				}
			}
		}
		System.out.println();

		// OR

		// Using set
		Set<String> set = new HashSet<>();
		for (String string : strArr) {
			if (set.add(string) == false) {
				System.out.print(string + " ");
			}
		}
	}
}

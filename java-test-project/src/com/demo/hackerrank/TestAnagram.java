package com.demo.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TestAnagram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {
		char[] arr1 = a.toLowerCase().toCharArray();
		char[] arr2 = b.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String s1 = new String(arr1);
		String s2 = new String(arr2);

		if (s1.equals(s2)) {
			return true;
		} else {
			return false;
		}
	}
}

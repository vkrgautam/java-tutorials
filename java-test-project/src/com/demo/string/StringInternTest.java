package com.demo.string;

public class StringInternTest {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = new String("abc");

		String str3 = "xyz";
		String str4 = new String("xyz");

		if (str1 == str2) {
			System.out.println("str1 and str2 are equal");
		} else {
			System.out.println("str1 and str2 are not equal");
		}

		if (str3 == str4.intern()) {
			System.out.println("str3 and str4 are equal");
		} else {
			System.out.println("str3 and str4 are not equal");
		}
	}
}

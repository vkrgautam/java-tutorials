package com.test.basics;

public class RegexDemo {

	public static void main(String[] args) {

		String strNum = "abcdef123";
		if (strNum.matches("\\d+")) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}

package com.test.string;

public class PrintReversedString {

	public static void main(String[] args) {

		String str = "VivekKumarGautam";
		String revStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println("Reversed String: " + revStr);
	}

}

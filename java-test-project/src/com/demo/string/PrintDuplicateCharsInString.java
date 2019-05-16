package com.demo.string;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateCharsInString {

	public static void main(String[] args) {

		String str = "VivekKumarGautam";
		char[] strArr = str.toLowerCase().toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for (char c : strArr) {
			if (charList.contains(c)) {
				System.out.println(c);
			}
			charList.add(c);
		}
	}

}

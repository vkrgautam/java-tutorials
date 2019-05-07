package com.test.string;

/**
 * Given a string s, matching the regular expression [A-Za-z !,?._'@]+, split
 * the string into tokens. We define a token to be one or more consecutive
 * English alphabetic letters. Then, print the number of tokens, followed by
 * each token on a new line.
 * 
 * @author GautamV
 */
public class StringSplitDemo {

	public static void main(String[] args) {

		String s = "He is a very very good boy, isn't he?";

		if (s.trim().length() != 0) {
			String[] strArr = new String[20];
			strArr = s.trim().split("[ .,'?!@_]+");

			System.out.println(strArr.length);
			for (String string : strArr) {
				System.out.println(string);
			}
		} else {
			System.out.println(s.trim().length());
		}
	}
}

package com.test.string;

import java.util.Scanner;

public class SubstringDemo {

	public static void main(String[] args) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			String str = scanner.next();
			int start = scanner.nextInt();
			int end = scanner.nextInt();

			String subStr = str.substring(start, end);
			System.out.println(subStr);
		} catch (Exception e) {
			if (null != scanner) {
				scanner.close();
			}
		}
	}
}

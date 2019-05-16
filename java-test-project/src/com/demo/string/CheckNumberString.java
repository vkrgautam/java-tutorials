package com.demo.string;

import org.apache.commons.lang3.StringUtils;

public class CheckNumberString {

	public static void main(String[] args) {

		String strNum = "12345678";
		if (isNumericUsingParse(strNum) && isNumericUsingRegex(strNum) && isNumericUsingUtil(strNum)) {
			System.out.println(strNum + " is a number");
		} else {
			System.out.println(strNum + " is not a number");
		}
	}

	public static boolean isNumericUsingParse(String strNum) {
		try {
			Integer.parseInt(strNum);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isNumericUsingRegex(String strNum) {
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}

	public static boolean isNumericUsingUtil(String strNum) {
		return StringUtils.isNumeric(strNum);
	}
}

package com.demo.string;

public class PrintReversedStringUsingRecursion {

	public static void main(String[] args) {
		String myStr = "vivek";
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);		
	}
	
	static String reverseString(String myStr) {
		if (myStr.isEmpty()){
			return myStr;
		}
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
}

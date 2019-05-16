package com.demo.string;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str = "My name is Vivek Gautam";
		String strArr[] = new String[10];
		
		strArr = str.split(" ");
		
		for (int i = strArr.length-1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}
}

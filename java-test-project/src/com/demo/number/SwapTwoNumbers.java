package com.demo.number;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int x = 48;
		int y = 57;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x: " + x + " and y: " + y);
	}
}

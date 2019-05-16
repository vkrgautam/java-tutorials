package com.demo.hackerrank;

import java.util.Arrays;

public class MinAndMaxValueInArray {

	public static void main(String[] args) {

		int numArr[] = new int[] { 55, 32, 45, 98, 82, 11, 9, 39, 50 };

		Arrays.sort(numArr);
		System.out.println("smallest: " + numArr[0] + " and largest: " + numArr[numArr.length - 1]);
		// OR
		// assign first element of an array to largest and smallest
		int smallest = numArr[0];
		int largest = numArr[0];
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i] > largest) {
				largest = numArr[i];
			} else if (numArr[i] < largest) {
				smallest = numArr[i];
			}
		}
		System.out.println("smallest: " + smallest + " and largest: " + largest);
	}
}

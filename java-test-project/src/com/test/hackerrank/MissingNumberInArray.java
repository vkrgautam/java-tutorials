package com.test.hackerrank;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int n = arr.length + 1;

		int total = n * (n + 1) / 2;

		for (int i = 0; i < arr.length; i++) {
			total -= arr[i];
		}
		System.out.println("Missing number is " + total);
	}
}

package com.test.java8;

import java.util.Arrays;

public class MinAndMaxValueInArray {

	public static void main(String[] args) {
		int arr[] = { 45, 65, 98, 12, 45, 8, 56 };

		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();

		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
}

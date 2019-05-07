package com.test.ds;

public class ReveredArray {

	public static void main(String[] args) {

		Integer numArr[] = new Integer[] { 55, 32, 45, 98, 82, 11, 9, 39, 50 };
		Integer revNumArr[] = new Integer[numArr.length];

		/*
		 * List<Integer> numList = Arrays.asList(numArr); Collections.reverse(numList);
		 * System.out.println(numList);
		 */

		// Using single array
		for (int i = numArr.length - 1; i >= 0; i--) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();

		// Using two arrays
		for (int i = numArr.length - 1, j = 0; i >= 0; i--, j++) {
			revNumArr[j] = numArr[i];
		}
		for (Integer num : revNumArr) {
			System.out.print(num + " ");
		}
	}
}

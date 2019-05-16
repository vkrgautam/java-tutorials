package com.demo.ds;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int arr1[] = new int[] { 1, 2, 3, 4, 5 };
		int arr2[] = new int[] { 6, 7, 8, 9, 10 };
		int mergedArr[] = new int[arr1.length + arr2.length];
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			mergedArr[i] = arr1[i];
			count++;
		}
		for (int i = 0; i < arr2.length; i++) {
			mergedArr[count++] = arr2[i];
		}

		// Printing merged array
		for (int i : mergedArr) {
			System.out.print(i + " ");
		}
	}

}

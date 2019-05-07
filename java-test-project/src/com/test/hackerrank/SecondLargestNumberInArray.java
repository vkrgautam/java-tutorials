package com.test.hackerrank;

class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34, 16};
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			} else if (arr[i] > max2) {
				max2 = arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}

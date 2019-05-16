package com.demo.hackerrank;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// int[] arr = { 5, 1, 4, 2, 8 };
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		bubbleSort(arr);
	}

	static void bubbleSort(int[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swapped = true;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			printArray(arr);
			// If no two elements were swapped by inner loop, then break
			if (!swapped)
				break;
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

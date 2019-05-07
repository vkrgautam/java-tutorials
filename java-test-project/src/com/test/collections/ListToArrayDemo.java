package com.test.collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayDemo {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		Integer numArr[] = new Integer[5];
		String strArr[] = new String[5];

		intList.add(4);
		intList.add(2);
		intList.add(9);
		intList.add(5);
		intList.add(1);
		strList.add("Four");
		strList.add("Two");
		strList.add("Nine");
		strList.add("Five");
		strList.add("One");

		/**
		 * In Java an array is also an object. if we will use intList.toArray() then
		 * while casting it will give ClassCastException from Object to Integer.
		 */
		numArr = (Integer[]) intList.toArray(new Integer[5]);
		strArr = (String[]) strList.toArray(new String[5]);

		for (int i : numArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (String i : strArr) {
			System.out.print(i + " ");
		}
	}
}

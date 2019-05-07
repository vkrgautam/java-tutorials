package com.test.hackerrank;

import java.util.HashMap;
import java.util.Map;

class FindDuplicateNumbersCount {
	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 1, 2, 3, 4, 1, 1, 2, 1 };
		Map<Integer, Integer> countMap = new HashMap<>();
		int count = 0;
		
		for (Integer item : arr) {
			if (countMap.containsKey(item))
				countMap.put(item, countMap.get(item) + 1);
			else
				countMap.put(item, 1);
		}
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}

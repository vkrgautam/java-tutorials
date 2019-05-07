package com.test.basics;

import java.util.Arrays;
import java.util.List;

class TestMain {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		int sum = number.stream().reduce(0, (i1, i2) -> i1 + i2);
		int multiply = number.stream().reduce(1, (i1, i2) -> i1 * i2);

		System.out.println(sum);
		System.out.println(multiply);
	}
}

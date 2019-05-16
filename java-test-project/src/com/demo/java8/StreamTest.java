package com.demo.java8;

import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		Stream<Integer> inputs = Stream.of(8, 7, 10, 15, 20, 22, 30);
		System.out.println(inputs.filter((n) -> n % 5 == 0).count());
	}
}

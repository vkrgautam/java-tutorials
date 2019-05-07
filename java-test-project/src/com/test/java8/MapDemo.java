package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);

		List<Integer> list1 = list.stream().map(n -> n * n).collect(Collectors.toList());
		list1.forEach(System.out::println);
	}
}

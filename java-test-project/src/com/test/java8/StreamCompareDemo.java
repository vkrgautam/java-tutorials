package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamCompareDemo {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(4);
		list1.add(2);
		list1.add(8);
		list1.add(18);
		list1.add(20);
		System.out.println(list1);

		Integer min = list1.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer max = list1.stream().max((i1, i2) -> i1.compareTo(i2)).get();

		System.out.println(min + " " + max);

		List<Integer> list2 = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);

		List<Integer> list3 = list1.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list3);

		List<Integer> list4 = list1.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list4);
	}
}

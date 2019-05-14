package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValueCountUsingStream {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("two");
		list.add("four");
		list.add("three");
		list.add("five");
		
		Map<Object, Long> counts = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
		System.out.println(counts);
	}
}

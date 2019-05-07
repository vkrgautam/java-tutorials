package com.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(0);
		list1.add(3);
		list1.add(null);
		list1.add(6);
		list1.add(null);
		list1.add(9);
		list1.add(null);
		list1.add(14);
		System.out.println(list1);
		List<Integer> list2 = list1.stream().filter(i -> null != i && i % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);

		Map<String, String> map = new HashMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		System.out.println(map);
		List<Map.Entry<String, String>> list = map.entrySet().stream()
				.filter(i -> i.getKey() == "1" || i.getKey() == "4").collect(Collectors.toList());
		System.out.println(list);
	}
}

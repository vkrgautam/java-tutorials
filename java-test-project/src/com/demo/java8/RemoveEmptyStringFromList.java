package com.demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyStringFromList {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("str1");
		list1.add("str2");
		list1.add("");
		list1.add("str4");
		
		List<String> list2 = new ArrayList<>();
		list2.add("str11");
		list2.add("str22");
		list2.add("");
		list2.add("str44");
				
		list1.removeIf(item -> item.isEmpty());
		list1.forEach(str -> System.out.println(str));
		
		List<String> filterted = list2.stream().filter(item -> !item.isEmpty()).collect(Collectors.toList());
		filterted.forEach(str -> System.out.println(str));
	}

}

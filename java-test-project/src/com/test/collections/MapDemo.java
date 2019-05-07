package com.test.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "A");
		map.put("b", "B");
		map.put("c", "C");
		map.put("d", "D");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + "->" + entry.getValue() + "  ");
		}
		System.out.println();

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print(key + "->" + map.get(key) + "  ");
		}
		System.out.println();
	}
}
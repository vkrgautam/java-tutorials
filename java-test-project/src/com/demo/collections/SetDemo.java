package com.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		/**
		 * HashSet represents the collection that uses a hash table for storage Hashing
		 * is used to store the elements in the HashSet. It contains unique items.
		 */
		Set<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Spring");
		set.add("Java");
		set.add("Spring Boot");
		set.add("Angular");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

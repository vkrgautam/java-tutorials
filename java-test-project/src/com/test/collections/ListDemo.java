package com.test.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> skills = new ArrayList<String>();
		skills.add("Java");
		skills.add("Spring");
		skills.add("Spring Boot");
		skills.add("Angular");
		skills.add("UX");
		System.out.println(skills);
		
		skills.remove("Spring");

		/**
		 * Even though java.util.ArrayList provides remove() methods e.g. remove (int
		 * index) and remove (Object element), you cannot use them to remove elements
		 * while iterating over ArrayList in Java because they will throw
		 * ConcurrentModificationException if called during iteration.
		 * 
		 * The right way to remove objects from ArrayList while iterating over it is by
		 * using the Iterator's remove() method.
		 * 
		 */
		Iterator<String> itr = skills.iterator();
		while (itr.hasNext()) {
			if (itr.next().equalsIgnoreCase("UX")) {
				itr.remove();
			}
		}
		System.out.println(skills);
	}

}

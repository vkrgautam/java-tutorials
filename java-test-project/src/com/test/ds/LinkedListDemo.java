package com.test.ds;

import java.util.LinkedList;

/**
 * Linked list is considered as non-primitive data structure contains a
 * collection of unordered linked elements known as nodes. Linked lists are
 * dynamic and flexible and can expand and contract its size.
 * 
 * Linked list provides the following two advantages over arrays: Dynamic size
 * and Ease of insertion/deletion
 * 
 * Linked lists have following drawbacks:Random access is not allowed. Extra
 * memory space for a pointer is required with each element of the list.
 * 
 * @author GautamV
 *
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		
		list.add("Value1");
		list.add("Value2");
		list.add("Value3");
		
		for (String val : list) {
			System.out.println(val);
		}
	}
}

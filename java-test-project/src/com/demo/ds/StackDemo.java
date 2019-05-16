package com.demo.ds;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Spring");
		stack.push("Spring Boot");
		stack.push("Angular");
		stack.push("UX");

		stack.pop();
		stack.pop();

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("stack.peek: " + stack.peek());
	}
}

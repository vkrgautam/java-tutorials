package com.demo.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Java lambda expression is consisted of three components: Argument-list,
 * Arrow-token and Body Argument-list: It can be empty or non-empty as well.
 * Arrow-token: It is used to link arguments-list and body of expression. Body:
 * It contains expressions and statements for lambda expression.
 * 
 */
public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		int width = 10;

		// Without lambda, Drawable implementation using anonymous class
		Drawable d1 = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d1.draw();

		// With lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();

		// Lambda expression without return keyword.
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Lambda expression with return keyword.
		Addable ad2 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad2.add(100, 200));

		// Lambda Expression Example: Foreach Loop
		List<String> list = new ArrayList<String>();
		list.add("String1");
		list.add("String2");
		list.add("String3");
		list.add("String4");
		list.forEach((n) -> System.out.println(n));
	}

}

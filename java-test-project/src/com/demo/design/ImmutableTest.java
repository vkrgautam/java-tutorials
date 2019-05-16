package com.demo.design;

public class ImmutableTest {

	public static void main(String[] args) {

		ImmutableClassDemo immutable = new ImmutableClassDemo(101, "John");

		System.out.println(immutable.getId());
		System.out.println(immutable.getName());

		// immutable.id = 102; //Error
	}
}

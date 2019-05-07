package com.test.java8;

/**
 * A Functional interface is also known as Single Abstract Method Interface,
 * since it has exactly one abstract method.
 * 
 * @author GautamV
 *
 */
@FunctionalInterface
interface FunctionalInterfaceDemo {

	double assess(int id, double percentage);

	default double computeGrade(double cost) {
		return 0.0;
	}

	static void display() {
		System.out.println("Display the grade details");
	}

	public String toString();

	public boolean equals(Object o);
}

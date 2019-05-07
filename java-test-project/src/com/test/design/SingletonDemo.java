package com.test.design;

/**
 * We need to have static member of class, private constructor and public static
 * factory method. Class can be made final.
 * 
 * @author GautamV
 *
 */
final class SingletonDemo {

	private static SingletonDemo instance;
	// Eager Initialization
	// private static SingletonDemo instance = new SingletonDemo();

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		// Lazy Initialization
		if (instance == null) {
			instance = new SingletonDemo();
		}
		return instance;
	}

}

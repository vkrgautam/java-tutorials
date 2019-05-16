package com.demo.design;

final class ThreadSafeSingletonDemo {

	// A variable should be declared volatile whenever its value could change unexpectedly.
	private static volatile ThreadSafeSingletonDemo instance;

	private ThreadSafeSingletonDemo() {
	}

	/**
	 * Double Checked Locking: In this approach the methods are not synchronized
	 * instead the instance creation code is put in a synchronized block.
	 * 
	 * @return ThreadSafeSingletonDemo instance
	 */
	public static ThreadSafeSingletonDemo getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingletonDemo.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonDemo();
				}
			}
		}
		return instance;
	}

}

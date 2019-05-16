package com.demo.design;

/**
 * Immutable objects are instances whose state doesn't change after it has been
 * initialized. An immutable class is good for caching purpose because you don’t
 * need to worry about if value changes. Other benefit of immutable class is
 * that it is inherently thread-safe, so you don't need to worry about thread
 * safety in case of multi-threaded environment.
 * 
 * Make all fields final and private, Don't provide "setter" methods, Don't
 * allow subclasses to override methods
 * 
 * @author GautamV
 *
 */
public final class ImmutableClassDemo {

	final int id;
	final String name;

	public ImmutableClassDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

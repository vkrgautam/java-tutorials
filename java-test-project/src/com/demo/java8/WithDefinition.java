package com.demo.java8;

public interface WithDefinition {
	default void print() {
		System.out.println("default method");
	}
}

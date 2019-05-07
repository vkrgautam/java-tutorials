package com.test.design;

import java.lang.reflect.Constructor;

/**
 * Java Reflection is a process of examining or modifying the run time behaviour
 * of a class at run time. Reflection can be caused to destroy singleton
 * property of singleton class.
 * 
 * @author GautamV
 *
 */
public class ReflectionTest {

	public static void main(String[] args) throws Exception {

		SingletonDemo sd1 = SingletonDemo.getInstance();
		SingletonDemo sd2 = null;

		Constructor[] constructors = SingletonDemo.class.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			// Make the private constructor as public
			constructor.setAccessible(true);
			sd2 = (SingletonDemo) constructor.newInstance();
			break;
		}
		if(sd1.equals(sd2)) {
			System.out.println("Singleton");
		} else {
			System.out.println("Not Singleton");
		}
	}

}

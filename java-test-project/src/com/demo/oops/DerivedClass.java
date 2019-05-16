package com.demo.oops;

public class DerivedClass extends BaseClass {

	public static void method1( ) {
		System.out.println("DerivedClass.method1");
	}
	
	public void method2( ) {
		System.out.println("DerivedClass.method2");
	}
	
	/*This static method cannot hide the instance method from BaseClass
	public static void method3( ) {
		System.out.println("DerivedClass.method3");
	}*/
}

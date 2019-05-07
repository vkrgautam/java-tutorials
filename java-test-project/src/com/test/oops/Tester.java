package com.test.oops;

public class Tester {

	public static void main(String[] args) {
		
		BaseClass base = new DerivedClass();
		BaseClass base2 = null;
		
		base.method1();
		base.method2();
		base.method3();
		
		base2.method1();
		// base2.method2(); //java.lang.NullPointerException
	}
}

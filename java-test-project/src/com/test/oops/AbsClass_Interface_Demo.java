package com.test.oops;

class AbsClass_Interface_Demo extends AbsClass_Demo implements Interface_Demo{

	public static void main(String[] args) {
		AbsClass_Interface_Demo obj = new AbsClass_Interface_Demo();
		obj.m1();
		obj.m2();
	}
	
	public void m2() {
		System.out.println("in AbsClass_Interface_Demo.m2");
	}
}

interface Interface_Demo {
	default void m1() {
		System.out.println("in Interface_Demo.m1");
	}
}

abstract class AbsClass_Demo {
	public void m1() {
		System.out.println("in AbsClass_Demo.m1");
	}
	
	public abstract void m2();
}
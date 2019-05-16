package com.demo.basics;

class CallSequenceDemo {
	
	static int i = 0;
	
	public CallSequenceDemo() {
		System.out.println("in constructor");
		i = 20;
	}

	public void m() {
		System.out.println("in method");
		i = 30;
	}
	
	public static void main(String[] args) {
		CallSequenceDemo d = new CallSequenceDemo();
		d.m();
		System.out.println(i);
	}
	
	static {
		System.out.println("in static block");
		i = 10;
	}
}

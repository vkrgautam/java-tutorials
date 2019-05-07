package com.test.basics;

import com.test.basics.InnerDemo.Inner;

class InnerDemo {

	public void getMessage() {
		System.out.println("in InnerDemo.getMessage");
	}

	class Inner {
		public void getMessage() {
			System.out.println("in Inner.getMessage");
		}
	}
}

public class InnerDemoTest {
	
	public static void main(String[] args) {
		Inner inn = new InnerDemo().new Inner();
		inn.getMessage();
	}
}

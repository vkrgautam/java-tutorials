package com.demo.number;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int number = 6;
		long factorial = factorial(number);
		System.out.println(factorial);
	}
	
	static long factorial(int number) {
		if(number > 0) {
			return factorial(number);
		}
		return 0;
	}
}

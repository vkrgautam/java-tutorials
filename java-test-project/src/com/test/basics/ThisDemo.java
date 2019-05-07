package com.test.basics;

public class ThisDemo {

	int n;
	String str;

	public ThisDemo(int n, String str) {
		super();
		n = n;
		str = str;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		ThisDemo obj = new ThisDemo(1, "Hi");
		System.out.println(obj.getN());
		System.out.println(obj.getStr());
	}
}

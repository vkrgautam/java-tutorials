package com.demo.number;

public class CheckArmstrongNumber {

	public static void main(String[] args) {

		int num = 1634; // 153
		int n, res = 0, rem;
		n = num;

		while (n > 0) {
			rem = n % 10;
			res += Math.pow(rem, 4);
			n = n / 10;
		}
		if (num == res) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}

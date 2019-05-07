package com.test.hackerrank;

public class MakingAnagrams {

	public static void main(String[] args) {
		String a = "cde";
		String b = "abc";
		System.out.println(makingAnagrams(a, b));
	}

	/**
	 * Print a single integer denoting the minimum number of characters which must
	 * be deleted to make the two strings anagrams of each other.
	 * 
	 * @param s1
	 * @param s2
	 * @return n
	 */
	static int makingAnagrams(String s1, String s2) {
		int[] chars = new int[26];
		int count = 0;
		for (char c1 : s1.toCharArray()) {
			chars[c1 - 97]++;
		}
		for (char c2 : s2.toCharArray()) {
			chars[c2 - 97]--;
		}
		for (int i : chars) {
			count += Math.abs(i);
		}
		return count;
	}
}

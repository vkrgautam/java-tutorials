package com.demo.ds;

public class TwoDArrayTest {

	public static void main(String[] args) {

		// int[][] twoD_arr = {{5, 12, 17}, {7, 14, 19}};

		int[][] twoD_arr = new int[2][3];
		twoD_arr[0][0] = 5;
		twoD_arr[0][1] = 12;
		twoD_arr[0][2] = 17;
		twoD_arr[1][0] = 7;
		twoD_arr[1][1] = 14;
		twoD_arr[1][2] = 19;

		for (int i = 0; i < twoD_arr.length; i++) {
			for (int j = 0; j < twoD_arr[i].length; j++) {
				System.out.println("twoD_arr[" + i + "][" + j + "] = " + twoD_arr[i][j]);
			}
		}
	}
}

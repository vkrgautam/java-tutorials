package com.demo.hackerrank;

/**
 * Emma is playing a new mobile game that starts with consecutively numbered
 * clouds. Some of the clouds are thunderheads and others are cumulus. She can
 * jump on any cumulus cloud having a number that is equal to the number of the
 * current cloud plus 1 or 2. She must avoid the thunderheads. Determine the
 * minimum number of jumps it will take Emma to jump from her starting position
 * to the last cloud. Print the minimum number of jumps needed to win the game.
 * 
 * For each game, Emma will get an array of clouds numbered 0 if they are safe
 * or 1 if they must be avoided.
 * 
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 * 
 * @author GautamV
 *
 */
public class JumpingOnClouds {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 0, 1, 0 }; // 4
		// int arr[] = {0, 0, 0, 1, 0, 0}; //3
		// int arr[] = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 }; // 6
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			if (i != arr.length - 2 && arr[i + 2] == 0) {
				i++;
			}
		}
		System.out.println(count);
	}
}

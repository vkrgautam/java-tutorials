package com.demo.basics;

import java.util.Scanner;

/**
 * Checked: are the exceptions that are checked at compile time. If some code
 * within a method throws a checked exception, then the method must either
 * handle the exception or it must specify the exception using throws keyword.
 * 
 * Unchecked are the exceptions that are not checked at compiled time.
 * 
 * In Java exceptions under Error and RuntimeException classes are unchecked
 * exceptions, everything else under throwable is checked.
 * 
 * Checked Exception is direct sub-Class of Exception while Unchecked Exception
 * are of RuntimeException.
 * 
 * @author GautamV
 *
 */
public class CustomExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			sc.close();

			if (n <= 10) {
				throw new CustomException("Please enter number greater than 10");
			} else {
				System.out.println(n);
			}
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

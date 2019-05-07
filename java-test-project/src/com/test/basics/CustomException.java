package com.test.basics;

/**
 * 
 * extends RuntimeException - Unchecked exception
 * extends Exception - Checked exception
 * 
 * @author GautamV
 *
 */
public class CustomException extends RuntimeException {

	public CustomException() {
		super();
	}

	public CustomException(String msg) {
		super(msg);
	}
}

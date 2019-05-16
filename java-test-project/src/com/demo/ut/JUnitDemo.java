package com.demo.ut;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class JUnitDemo {
	
	private UTDemo utdemo;

	@Before
	public void setUp() {
		utdemo = new UTDemo();
	}
	
	@Test
	public void testIsPalindromeString() {
		assertTrue(utdemo.isPalindromeString("level"));
	}
	
	@Test
	public void testIsAnagramStrings() {
		UTDemo utdemo = new UTDemo();
		assertTrue(utdemo.isAnagramStrings("below", "elbow"));
	}
}

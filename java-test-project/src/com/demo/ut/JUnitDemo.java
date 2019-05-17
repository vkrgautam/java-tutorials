package com.demo.ut;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JUnitDemo {
	
	private StringChecks utdemo;

	@Before
	public void setUp() {
		utdemo = new StringChecks();
	}
	
	@Test
	public void testIsPalindromeString() {
		assertTrue(utdemo.isPalindromeString("level"));
	}
	
	@Test
	public void testIsAnagramStrings() {
		assertTrue(utdemo.isAnagramStrings("below", "elbow"));
	}
}

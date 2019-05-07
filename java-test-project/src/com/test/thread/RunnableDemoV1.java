package com.test.thread;

/**
 * Thread creation by implementing the Runnable Interface
 * 
 * @author GautamV
 */
public class RunnableDemoV1 implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i + " of RunnableDemoV1");
		}
	}
}

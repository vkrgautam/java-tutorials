package com.test.thread;

/**
 * Thread creation by extending the Thread class
 * 
 * @author GautamV
 */
public class ThreadDemoV2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i + " of ThreadDemoV2");
		}
	}
}

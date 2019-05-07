package com.test.thread;

public class DaemonThreadDemoV2 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("DaemonThreadDemoV2: Daemon thread work");
		} else {
			System.out.println("DaemonThreadDemoV2: User thread work");
		}
	}
}

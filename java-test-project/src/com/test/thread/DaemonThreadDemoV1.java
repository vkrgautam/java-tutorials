package com.test.thread;

public class DaemonThreadDemoV1 extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("DaemonThreadDemoV1: Daemon thread work");
		} else {
			System.out.println("DaemonThreadDemoV1: User thread work");
		}
	}
}

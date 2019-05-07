package com.test.thread;

/**
 * Daemon thread in java is a service provider thread that provides services to
 * the user thread. Its life depend on the mercy of user threads i.e. when all
 * the user threads dies, JVM terminates this thread automatically. It is a low
 * priority thread.
 * 
 * @author GautamV
 *
 */
public class DaemonThreadMainDemo {

	public static void main(String[] args) {

		DaemonThreadDemoV1 t1 = new DaemonThreadDemoV1();
		DaemonThreadDemoV2 t2 = new DaemonThreadDemoV2();
		
		// If you want to make a user thread as Daemon, it must not be started otherwise
		// it will throw IllegalThreadStateException.
		t1.setDaemon(true);

		t1.start();
		t2.start();
	}
}

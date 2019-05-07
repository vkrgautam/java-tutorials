package com.test.thread;

/**
 * Threads are light-weight processes within a process.
 * 
 * @author GautamV
 */
public class ThreadMainDemo extends Thread {

	public static void main(String[] args) {

		ThreadDemoV1 t1 = new ThreadDemoV1();
		Thread t2 = new Thread(new RunnableDemoV1());
		ThreadDemoV2 t3 = new ThreadDemoV2();

		/**
		 * The join() method waits for a thread to die. In other words, it causes the
		 * currently running threads to stop executing until the thread it joins with
		 * completes its task.
		 */
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/**
		 * if we call run() method directly instead start() method, t1 and t2 will be
		 * treated as normal object not thread object.
		 */
		t1.start();
		/**
		 * After starting a thread, it can never be started again. If you does so, an
		 * IllegalThreadStateException is thrown.
		 */
		t2.start();
	}
}

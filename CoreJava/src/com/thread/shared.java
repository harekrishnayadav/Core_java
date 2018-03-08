package com.thread;

public class shared {
	int i;

	synchronized void sharedMethod() {
		Thread t = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println("current thread:" + t.getName() + "  " + "i:" + i);

		}
	}

}

package com.thread;

public class SharedTest {

	public static void main(String[] args) {
		final shared s = new shared();
		Thread t1 = new Thread("Thread-1") {
			public void run() {
				s.sharedMethod();
			}
		};
		Thread t2 = new Thread("Thread-2") {
			public void run() {
				s.sharedMethod();
			}
		};
		t1.start();
		t2.start();

	}

}

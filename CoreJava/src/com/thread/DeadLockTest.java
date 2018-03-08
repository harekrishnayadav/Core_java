package com.thread;

public class DeadLockTest {

	public static void main(String[] args) {
		final DeadLock d1 = new DeadLock();
		final DeadLock d2 = new DeadLock();
		Thread t1 = new Thread() {
			public void run() {
				d1.methodOne(d2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				d2.methodTwo(d1);
			}
		};
	}

}

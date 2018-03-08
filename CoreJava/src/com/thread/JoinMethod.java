package com.thread;

public class JoinMethod extends Thread {
	public void run() {
		for (int i = 0; i <= 2; i++) {
			try {
				Thread.sleep(5000);
				System.out.println("Thread Class current thread:" + Thread.currentThread().getName());

			} catch (Exception ex) {
				System.out.println("Exception has" + " been caught" + ex);
			}
			System.out.println(i);
		}
	}

}

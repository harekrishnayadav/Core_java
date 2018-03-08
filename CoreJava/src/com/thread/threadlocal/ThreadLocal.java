package com.thread.threadlocal;

public class ThreadLocal {
	public static void main(String[] args) {
		class MyThread1 extends Thread {
			public void run() {
				System.out.println("thread");
			}
		}
		class MyThread2 implements Runnable {

			@Override
			public void run() {
				System.out.println("runnable");
			}

		}
		MyThread1 t1 = new MyThread1();
		t1.start();
		MyThread2 t2 = new MyThread2();
		Thread t = new Thread(t2);
		t.start();

	}

}

package com.thread;

public class ThreadId extends Thread {
	public void run() {
		System.out.println(getId() + " is running");
	}

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName() + "   " + t1.getId());
		ThreadId t = new ThreadId();
		t.start();

	}

}

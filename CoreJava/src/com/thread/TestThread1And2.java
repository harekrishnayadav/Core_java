package com.thread;

public class TestThread1And2 {

	public static void main(String[] args) {
		Thread1 d1 = new Thread1();
		Thread2 d2 = new Thread2();
		d1.start();
		d2.start();
		System.out.println("Main thread");

	}

}

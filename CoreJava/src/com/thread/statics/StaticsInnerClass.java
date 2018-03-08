package com.thread.statics;

public class StaticsInnerClass {
	static class MyThread extends Thread {
		public void run() {
			System.out.println("Thread Inner class");
		}
	}

	static class MyThread1 implements Runnable {

		@Override
		public void run() {
			System.out.println("Runnable class");
		}

	}

}

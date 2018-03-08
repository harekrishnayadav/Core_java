package com.thread.nonstatics;

public class NonStaticsInner {
	class MyThread1 extends Thread{
		public void run(){
			System.out.println("Thread class");
		}
	}
	class MyThread2 implements Runnable{

		@Override
		public void run() {
			System.out.println("runnable class");
		}
		
	}

}

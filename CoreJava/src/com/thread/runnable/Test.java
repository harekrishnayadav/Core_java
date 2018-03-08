package com.thread.runnable;

public class Test {

	public static void main(String[] args) {
		Thread1 d1=new Thread1();
		Thread d=new Thread(d1);
		d.start();

	}

}

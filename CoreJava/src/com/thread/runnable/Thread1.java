package com.thread.runnable;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println(i + " * " + (i + 1) + " = " + i * (i + 1));
		}
	}

}

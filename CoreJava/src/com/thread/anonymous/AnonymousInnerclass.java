package com.thread.anonymous;

public class AnonymousInnerclass {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				System.out.println("thread");
			}
		}.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("runnable");
			}
		}).start();

	}
}

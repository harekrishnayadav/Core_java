package com.thread;

public class JoinMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started :" + Thread.currentThread().getName() + " ," + "id:"
				+ Thread.currentThread().getId());
		final Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);

				}
				System.out.println("Numbers from 0 to 9 are printed");
			}
		};
		final Thread t2 = new Thread() {
			public void run() {
				try {
					// t1.sleep(50000);
					t1.join(5000, 50000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				for (int i = 10; i < 20; i++) {
					System.out.println(i);

				}
				System.out.println("Numbers from 9 to 20 are printed");
			}

		};
		final Thread t3 = new Thread() {
			public void run() {
				try {
					// t2.sleep(5000);
					t2.join(5000, 50000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				for (int i = 19; i < 30; i++) {
					System.out.println(i);

				}
				System.out.println("Numbers from 19 to 30 are printed");
			}

		};
		t3.start();
		t2.start();
		// t1.start();
		// t3.join();

	}

}

package com.thread;

public class JoinMethodTest {

	public static void main(String[] args) {
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();
		// thread start
		t1.start();
		/*try {
			System.out.println("current thread t1:" + Thread.currentThread().getName());
			t1.join();

		} catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}*/
		
		t2.start();
		try {
			System.out.println("curren thread t2:" + Thread.currentThread().getName());
			t2.join();
		} catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}
		t3.start();
		/*try {
			System.out.println("curren thread t3:" + Thread.currentThread().getName());
			t3.join();

		} catch (Exception ex) {
			System.out.println("Exception has " + "been caught" + ex);
		}*/

	}

}

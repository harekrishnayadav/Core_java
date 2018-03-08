package com.thread.nonstatics;

import com.thread.nonstatics.NonStaticsInner.MyThread1;
import com.thread.nonstatics.NonStaticsInner.MyThread2;

public class NonStaticClass {

	public static void main(String[] args) {
		MyThread1 t1 = new NonStaticsInner().new MyThread1();
		t1.start();
		MyThread2 t2 = new NonStaticsInner().new MyThread2();
		Thread t = new Thread(t2);
		t.start();

	}

}

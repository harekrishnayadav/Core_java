package com.thread.statics;

import com.thread.statics.StaticsInnerClass.MyThread;
import com.thread.statics.StaticsInnerClass.MyThread1;

public class TestStaticInnerClass {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		MyThread1 t2 = new MyThread1();
		Thread t = new Thread(t2);
		t.start();

	}

}

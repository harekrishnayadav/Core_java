package com.thread.concrete;

public class ConcreteClass1 {
	void method() {
		Thread1 d1 = new Thread1();
		d1.start();
		System.out.println("class 1");
	}
}

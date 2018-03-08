package com.thread.concrete;

public class Test {

	public static void main(String[] args) {
		ConcreteClass1 c1 = new ConcreteClass1();
		c1.method();
		ConcreteClass2 c2 = new ConcreteClass2();
		c2.method();
		Thread1 d3=new Thread1();
		d3.start();

	}

}

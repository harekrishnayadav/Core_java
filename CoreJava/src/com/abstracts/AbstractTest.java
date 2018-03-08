package com.abstracts;

abstract class AbstractsDemo {
	abstract int add(int a, int b);

}

public class AbstractTest {

	public static void main(String[] args) {
		int result = new AbstractsDemo() {

			@Override
			int add(int a, int b) {
				return a + b;
			}
		}.add(10, 20);

	}

}

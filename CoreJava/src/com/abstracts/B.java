package com.abstracts;

abstract class B extends A {
	void firstMethod() {
		System.out.println("First");
		thirdMethod();
	}

	abstract void thirdMethod();
}

package com.abstracts;

abstract class A {
	abstract void firstMethod();
	void secondMethod(){
		System.out.println("SecondMetod");
		firstMethod();
	}
	
	
	
	

}


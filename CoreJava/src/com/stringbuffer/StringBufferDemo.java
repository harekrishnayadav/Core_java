package com.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hare");
		System.out.println("before Sb:" + sb);
		StringBuffer sb1 = sb.append("Krishna");
		System.out.println("Sb:" + sb);
		System.out.println("sb1:" + sb1);
	}

}

package com.basic;

class A {
	static int m = 100;// static variable

	void method() {
		int n = 90;// local variable
	}

	public static void main(String args[]) {
		int data = 50;// instance variable
	}
}// end of class

public class LocalVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}
}

package com.basic;

class A1 {
	A1() {
		//this(5);
		System.out.println("Your RollNO");
		
	}

	A1(int x) {
		this();
		System.out.println(x);
	}
}

public class ThisExample1 {
	public static void main(String args[]) {
		A1 a = new A1(10);
	}
}


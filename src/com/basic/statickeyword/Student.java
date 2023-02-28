package com.basic.statickeyword;

public class Student {
	int rollno;// instance variable
	String name;
	
	static String college = "ITS";// static variable
	// constructor

	static {
		System.out.println("static block is invoked");
	}

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	void printStudent() {
		System.out.println("Roll No:" + rollno);
		System.out.println("Name:" + name);
	}

	static void welcomeMsg() {
		System.out.println("Welcome Student");
	}
}

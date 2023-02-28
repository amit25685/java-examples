package com.basic.statickeyword;

public class StatcVariableEx1 {

	public static void main(String aa[]) {
		Student s1 = new Student(1, "Ajay");
		Student s2 = new Student(2, "Ramesh");
		s1.printStudent();
		s2.printStudent();
		Student.welcomeMsg();

	}
}

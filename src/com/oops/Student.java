package com.oops;

 // Java Program to illustrate how to define a class and fields
//Defining a Student class.  
public class Student {
//defining fields  
	int id;// field or data member or instance variable
	String name;

//creating main method inside the Student class  
	public static void main(String args[]) {
//Creating an object or instance  
		Student Rohan = new Student();// creating an object of Student
		Student Ravi = new Student();
		Rohan.id=4;
		Rohan.name="Rohan";
		Ravi.id=5;
		Ravi.name="Ravi";
//Printing values of the object  
		System.out.println(Rohan.id);// accessing member through reference variable
		System.out.println(Rohan.name);
		System.out.println(Ravi.id);// accessing member through reference variable
		System.out.println(Ravi.name);
		
	}
}

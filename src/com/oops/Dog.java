package com.oops;

public class Dog extends Animal {
	String color="black";  
	void printColor(){  
	System.out.println(this.color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	System.out.println(shape);
	//System.out.println(super.toString());
	}
	
}

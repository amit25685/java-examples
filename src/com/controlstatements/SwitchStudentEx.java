package com.controlstatements;

public class SwitchStudentEx {
	public static void main(String[] args) {
		int num = 1;
		 
		String className="A";
		switch (className) {
		case "A":
			System.out.println("number is 0");
			break;
		case "B":
			System.out.println("number is 1");
			break;
		default:
			System.out.println(num);
		}
	}

}

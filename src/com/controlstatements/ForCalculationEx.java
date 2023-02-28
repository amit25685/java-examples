package com.controlstatements;

public class ForCalculationEx {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * int sum = 0; for (int j = 1; j <= 10; j++) { sum = sum + j; }
	 * System.out.println("The sum of first 10 natural numbers is " + sum); }
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}
	}

}

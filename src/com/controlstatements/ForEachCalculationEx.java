package com.controlstatements;

public class ForEachCalculationEx {
	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub 
		String[] names = { "Java", "C", "C++",
		  "Python", "JavaScript" };

	int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	System.out.println("Printing the content of the array names:\n");for(int na:num)
	{
		System.out.println(na * 43);
	}

}

}

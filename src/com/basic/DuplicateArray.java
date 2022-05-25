package com.basic;

import java.util.ArrayList;

public class DuplicateArray {

	public static ArrayList<String> noOfItems(String[] arr1, String[] arr2) {
		//String[] result= {};
		ArrayList<String> result = new ArrayList<>();		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(!arr1[i].equalsIgnoreCase(arr2[j])) {
					result.add(arr1[i]);				
				}		
				
			}
			
		}		
		return result;
	}
	
	public static void main(String aa[]) {
		String[] arr1= {"a","b","c"};
		String[] arr2= {"f","g","a"};
		
		System.out.println("Result is: "+noOfItems(arr1,arr2));
	}
}

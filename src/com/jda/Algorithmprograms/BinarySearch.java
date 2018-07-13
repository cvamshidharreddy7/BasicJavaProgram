package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

public class BinarySearch {
	Utility utility = new Utility();
	public static void main(String[] args){
		Utility utility = new Utility();
		int z;
		System.out.println("Integer-1 andString -2");
		z = utility.getZ();
			if(z==1){
				
			Integer[] arr = utility.getIntegerArray();
			int low =0;
			int high = arr.length-1;
			System.out.println("Enter the string you want to search for");
			int value = utility.getValue();
			System.out.println(utility.binarySearch(arr, value, low, high));
		
		}
		if(z==2){
			String[] arr = utility.getStringArray();
			int low =0;
			int high = arr.length-1;
			System.out.println("Enter the string you want to search for");
			String value = utility.getStringValue();
			System.out.println(utility.binarySearch(arr, value, low, high));
		}
		
	}
}

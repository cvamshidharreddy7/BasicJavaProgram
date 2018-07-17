package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

public class ToBinary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value of the decimal number");
		int n= utility.getN();
		Integer[] arr = utility.getBinary(n);
		
		int[] array = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			array[i] = arr[i].intValue();
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
}
}

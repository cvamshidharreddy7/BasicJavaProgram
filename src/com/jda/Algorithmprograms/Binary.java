package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value of n");
		int n=utility.getN();
		int[] swappedNumber = utility.swapNibbles(n);
		for(int i=0;i<swappedNumber.length;i++) {
			System.out.print(swappedNumber[i]);
		}
		// To find if the resultant number is power of 2
		int count=0;
		for(int i=0;i<swappedNumber.length-1;i++) {
			
				if(swappedNumber[i] == 1)count++;
				
			}
		System.out.println();
		if(count ==1) System.out.println("Yes, power of 2");
		else System.out.println("NOt a power of two");
		}
}

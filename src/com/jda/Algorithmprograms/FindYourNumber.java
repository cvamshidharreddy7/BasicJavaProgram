package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

public class FindYourNumber {
	public static void main(String[] args){
		Utility utility = new Utility();
		System.out.println("Enter the value of N");
		int N= utility.getN();
		int low = 0;
		int high = N-1;
		System.out.println("Think of a number between 0 and N-1");
	int i=	utility.binarySearch(low,high);
	}
		
}

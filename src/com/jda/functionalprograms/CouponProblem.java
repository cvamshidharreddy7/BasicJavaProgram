package com.jda.functionalprograms;

import com.jda.utility.Utility;

public class CouponProblem {
	public static void main(String[] args){
		Utility utility = new Utility();
		int[] arr = utility.getNumbers();
		
		System.out.println(utility.totalRandomNumber(arr));
		}
}

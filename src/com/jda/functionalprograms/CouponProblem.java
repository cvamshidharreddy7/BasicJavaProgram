package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class CouponProblem {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Utility utility = new Utility();
		int[] arr = utility.getNumbers();
		
		System.out.println(utility.totalRandomNumber(arr));
		}
}

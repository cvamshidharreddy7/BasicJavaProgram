package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class Sqrt {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value of c");
		Double c = utility.getP();
		System.out.println(utility.getSqrt(c));		
	}
}

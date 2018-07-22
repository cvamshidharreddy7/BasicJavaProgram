package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class NthHarmonicNumber {
	/**
	 * @param args
	 */
	public static void main(String[] args){
 	Utility utility = new Utility();
	
			int Number =  utility.inputNumber();
			
			System.out.println(utility.harmonicValue(Number));
}
}

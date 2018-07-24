package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PowersOfTwo {		

			/**
			 * @param args
			 */
			public static void main(String[] args){
				Utility utility = new Utility();
				
				  	int Number = utility.inputNumber();
					
					for(int i=0;i<Number;i++){
					System.out.println(utility.getPower(Number));
					}
			}
}

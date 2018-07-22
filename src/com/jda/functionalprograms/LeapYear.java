package com.jda.functionalprograms;

import com.jda.utility.Utility;


/**
 * @author 1022279
 *
 */
public class LeapYear {
		/**
		 * @param args
		 */
		public static void main(String[] args){
			
			Utility utility= new Utility();
			
			int year = utility.getYear();
			if(utility.IsLeapYear(year) == false){
				System.out.println("Not a leap year!");
			}
			else {
				System.out.println("Leap Year!");
			}
			
		}

}

package com.jda.functionalprograms;

import com.jda.utility.Utility3;

public class LeapYear {
		public static void main(String[] args){
			
			Utility3 utility3 = new Utility3();
			
			int year = utility3.getYear();
			if(utility3.IsLeapYear(year) == false){
				System.out.println("Not a leap year!");
			}
			else {
				System.out.println("Leap Year!");
			}
			
		}

}

package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int month,day,year;
		System.out.println("Enter motnh,day and year");
		month = utility.getMonth();
		day =utility.getDay();
		year = utility.getYear1();
		/*
		 * 0-Sunday
		 * 1-Monday
		 * 2-Tuesday
		 * 3-Wednesday
		 * 4-Thursday
		 * 5-Friday
		 * 6-Saturday
		 */
		System.out.println(utility.dayOfWeek(month,day,year));		
	}
}

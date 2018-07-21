package com.jda.DataStructure_programs;

import java.io.FileNotFoundException;


import com.jda.utility.Utility;

public class Calendar {
	

	public static void main(String[] args)  throws FileNotFoundException{
		Utility utility = new Utility();
		System.out.println("ENter the month and the year ");
		int month = utility.getMonth();
		int year = utility.getYear();
		int[] days = utility.getDays();
		String[] months = utility.getMonths();
		if(month ==2 && utility.IsLeapYear(year))
			days[month] = 29;
			System.out.println("  "+ months[month] + " " + year);
			System.out.println(" Su  M  T  W Th  F  S");
			int firstDay = utility.dayOfWeek(month,1,year );//First day.
			//To calculate the number of spaces for the first day.
			for(int i=0;i<firstDay;i++) {
				System.out.print("   ");
				
			}
			String[][] calendar = new String[7][7];
			int k=firstDay;
			
				for(int i=0;i<firstDay;i++){
					calendar[0][i] = "  ";
				}
				
			
			for(int i=1;i<=days[month];i++) {
				if(i<10) {
					System.out.print("  "+i);					
					if(((i+firstDay)%7 == 0)) { 						
						System.out.println();					
					}
				}
				else {
					System.out.print(" "+i);
				if(((i+firstDay)%7 == 0)) System.out.println();
				}
			}
	    
	}
}
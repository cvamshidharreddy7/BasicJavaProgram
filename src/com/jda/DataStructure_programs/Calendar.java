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
		
			int k=firstDay;
			String[] temp=new String[42];
			String[][] calendarArray = new String[6][7];
			
				for(int i=0;i<firstDay;i++){
					
					temp[i] = "  ";
				}
			
			
			
			for(int i=1;i<=days[month];i++) {
				if(i<10) {
					System.out.print("  "+i);	
				temp[i+firstDay-1] = Integer.toString(i);
					if(((i+firstDay)%7 == 0)) { 						
						System.out.println();					
					}
				}
				else {
					System.out.print(" "+i);
					temp[i+firstDay-1] = Integer.toString(i);
				if(((i+firstDay)%7 == 0)) System.out.println();
				}
			}
			System.out.println();
			for(int i=0;i<temp.length;i++) {
				if(temp[i]==null) temp[i] = " ";
			}
		/*for(int i=0;i<temp.length;i++) {
				System.out.print(temp[i]+",");
			}
			*/
			//Setting values in temp which are null to zero
			for(int i=0;i<temp.length;i++) {
				if(temp[i]==null) {
					temp[i] ="0";
				}
			}
		System.out.println();
			int count =0;
			for(int i=0;i<6;i++) {
				for(int j=0;j<7;j++) {
					if(count == temp.length) break;
					calendarArray[i][j] = temp[count];
					count++;
				}
			}
			for(int i=0;i<6;i++) {
				for(int j=0;j<7;j++) {
					System.out.print(calendarArray[i][j] + "   ");
				
					}System.out.println();
			}
			
	    
	}
}
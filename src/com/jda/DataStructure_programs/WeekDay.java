package com.jda.DataStructure_programs;

import com.jda.utility.Queue;
import com.jda.utility.Utility;
import java.util.HashMap;
/**
 * @author 1022279
 *
 */
public class WeekDay {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Utility utility = new Utility();
		
		HashMap<Integer,Queue<Integer>> week = new HashMap<>();
		for(int i=0;i<6;i++) {
			week.put(i, null);
		}
		System.out.println("ENter the month and the year ");
		int month = utility.getMonth();
		int year = utility.getYear();
		int[] days = utility.getDays();
		String[] months = utility.getMonths();
		if (month == 2 && utility.IsLeapYear(year))
			days[month] = 29;
		System.out.println("  " + months[month] + " " + year);
		System.out.println(" Su  M  T  W Th  F  S");
		int firstDay = utility.dayOfWeek(month, 1, year);// First day.
		int count=1;
		for(int i=0;i<6;i++) {
			Queue<Integer> q = new Queue<Integer>();
			week.put(i,q);
			for(int j=0;j<7;j++) {
				if(i ==0 && j<firstDay) {
					week.get(i).enqueue(0);					
				}
				else {
					if(count <= days[month]) {
						week.get(i).enqueue(count);
						count++;
					}
					else {
						week.get(i).enqueue(0);
					}
				}
			}
			
		}
		for(int i=0;i<6;i++) {
			for (int j = 0; j < 7; j++) {
				int temp = week.get(i).dequeue().value;
				if(temp<=9) {
					if(temp ==0) System.out.print("   ");
					else System.out.print("  " + temp);
				}
				else System.out.print(" " + temp);
			}
			System.out.println();
		}
	}

}

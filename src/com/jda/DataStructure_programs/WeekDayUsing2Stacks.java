package com.jda.DataStructure_programs;

import java.util.HashMap;

import com.jda.utility.Queue;
import com.jda.utility.QueueUsing2Stacks;
import com.jda.utility.Utility;

public class WeekDayUsing2Stacks {
	public static void main(String args[]) throws Exception {
		Utility utility = new Utility();
		HashMap<Integer, QueueUsing2Stacks<Integer>> week = new HashMap<>();
		for (int i = 0; i < 6; i++) {
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
		int count = 1;
		for (int i = 0; i < 6; i++) {
			QueueUsing2Stacks<Integer> q = new QueueUsing2Stacks<Integer>(31);
			week.put(i, q);
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < firstDay) {
					week.get(i).enqueue(0);
				} else {
					if (count <= days[month]) {
						week.get(i).enqueue(count);
						count++;
					} else {
						week.get(i).enqueue(0);
					}
				}
			}

		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				int temp = week.get(i).dequeue();
				if (temp <= 9) {
					if (temp == 0)
						System.out.print("   ");
					else
						System.out.print("  " + temp);
				} else
					System.out.print(" " + temp);
			}
			System.out.println();

		}
	}

}
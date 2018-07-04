package com.jda.utility;

import java.util.Scanner;

import com.jda.functionalprograms.LeapYear;

public class Utility3 {
				Scanner scanner;
				public Utility3(){
					scanner  = new Scanner(System.in);				
				}
				public int getYear(){
					return scanner.nextInt();
				}
				
				public boolean IsLeapYear( int year) {
					boolean flag = false;
					if(year%400==0) flag = true;
					else if(year%100 ==0) flag = false;
					else if(year%4==0) flag = true;
					else flag = false;
					return flag;
				}
}

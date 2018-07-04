package com.jda.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility(){
		scanner =new Scanner(System.in);
	}
	public String inputName(){
		return scanner.next();
	}
	public  String replaceString(String x,String name){
	          x = x.replaceAll("<<UserName>>",name);
					return x;
					
			}
	
		public int numberOfFlips() {
			return scanner.nextInt();
		}
		public double randomNumberGenerator(){
			return Math.random();
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

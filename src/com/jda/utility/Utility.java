package com.jda.utility;

import java.util.Scanner;

import com.jda.functionalprograms.PowersOfTwo;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String inputName() {
		return scanner.next();
	}

	public String replaceString(String x, String name) {
		x = x.replaceAll("<<UserName>>", name);
		return x;

	}

	public int numberOfFlips() {
		return scanner.nextInt();
	}

	public double randomNumberGenerator() {
		return Math.random();
	}

	public int getYear() {
		return scanner.nextInt();
	}

	public boolean IsLeapYear(int year) {
		boolean flag = false;
		if (year % 400 == 0)
			flag = true;
		else if (year % 100 == 0)
			flag = false;
		else if (year % 4 == 0)
			flag = true;
		else
			flag = false;
		return flag;
	}

	public int inputNumber() {
		return scanner.nextInt();
	}

	PowersOfTwo powersOfTwo = new PowersOfTwo();
	int power = 1;

	public int getPower(int number) {
		power = power * 2;
		return power;
	}
	public double getInverse(int number){
			Double number1 = Double.valueOf(number);
			
			return 1/number1 ;
	}
	double harmonicNumber = 0; 
	public double harmonicValue(int number){
			for(int i=1;i<=number;i++){
				harmonicNumber += getInverse(i);
			}
			return harmonicNumber;
	}

}

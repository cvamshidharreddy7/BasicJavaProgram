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

	public double getInverse(int number) {
		Double number1 = Double.valueOf(number);

		return 1 / number1;
	}

	double harmonicNumber = 0;

	public double harmonicValue(int number) {
		for (int i = 1; i <= number; i++) {
			harmonicNumber += getInverse(i);
		}
		return harmonicNumber;
	}

	int numberOfTwos = 0;

	public int makeOddNumber(int number) {
		while (number % 2 == 0) {
			number = number / 2;
			numberOfTwos++;
		}
		for (int i = 0; i < numberOfTwos; i++) {
			System.out.print("2" + " ");
		}
		return number;
	}

	public int primeFactorisation(int number) {
		number = makeOddNumber(number);
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}

		}
		return 0;
	}

	// Gambler problem
	public int getStake() {
		return scanner.nextInt();
	}

	public int getGoal() {
		return scanner.nextInt();
	}

	public int getNumber() {
		return scanner.nextInt();
	}

	public void gamblingAlgo(int stake, int goal, int number) {

		int wins = 0;
		int losses = 0;

		
		int total = wins+losses;
		while(stake !=0) {
			int randNum = (int) (Math.random() * 2);
			if (randNum == 0) {
				// win condition
				stake++;
				wins++;
			} else {
				// lose condition
				stake--;
				losses++;
			}
		}
		System.out.println(wins + "wins and " + losses +"losses");
		
	}

}
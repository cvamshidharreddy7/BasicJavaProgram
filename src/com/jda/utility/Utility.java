package com.jda.utility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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

		int total = wins + losses;
		for (int i = 0; i < number; i++) {
			while (stake != 0 && stake < goal) {
				int randNum = (int) (Math.random() * 2);
				if (randNum == 0) {
					// win condition

					stake++;
					wins++;
					System.out.println(stake);
				} else {
					// lose condition
					stake--;
					losses++;
				}
			}
		}
		System.out.println(wins + " wins and " + losses + " losses");

	}

	// **************************************************Coupon problem**********************//
	int total;
	int number;

	public int[] getNumbers() {
		ArrayList<Integer> arrLi = new ArrayList<Integer>();
		/*
		 * System.out.println("Please enter the numbers and enter -1 to stop");
		 * while(scanner.nextInt() != -1){ arrLi.add(scanner.nextInt()); } int[]
		 * arr = new int[arrLi.size()]; for(int i=0;i<arrLi.size();i++){
		 * 
		 * arr[i] = Integer.parseInt(arrLi.get(i).toString()); }
		 * 
		 * return arr;
		 */

		System.out.println("Enter the total number of coupons");
		total = scanner.nextInt();

		System.out.print("Enter the coupons' count you want to enter");
		number = scanner.nextInt();
		int[] arr = new int[number];
		System.out.println("Enter the coupons' numbers");
		for (int i = 0; i < number; i++) {
			arr[i] = scanner.nextInt();
		}

		return arr;
	}

	public int randomNumberFunction(int total) {

		return (int) (Math.random() * total);

	}

	Set<Integer> randomSet = new HashSet<Integer>();
	int count = 0;

	public int totalRandomNumber(int[] arr) {
		while (count <= number) {
			int randomNumber = randomNumberFunction(total);
			for (int i = 0; i < arr.length; i++) {
				if (randomNumber == arr[i])
					count++;
				randomSet.add(randomNumber);
			}

		}
		int totalRandomNumbers = randomSet.size();
		return totalRandomNumbers;
	}
}
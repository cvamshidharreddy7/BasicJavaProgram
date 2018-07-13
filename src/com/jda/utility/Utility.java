package com.jda.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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

	// **************************************************Coupon
	// problem**********************//
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

	/************************ Two D Array *******************************/
	int M;
	int N;
	int dataType;

	public void getData() {
		System.out.println("Enter number of rows");
		M = scanner.nextInt();
		System.out.println("Enter number of columns");
		N = scanner.nextInt();
		System.out.println("Enter the datatype");
		dataType = scanner.nextInt();
	}

	public void switchMethod() {
		PrintWriter out = new PrintWriter(System.out);
		switch (dataType) {
		case 1:
			System.out.println("Enter the 2D array");
			int[][] integerArray = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					integerArray[i][j] = scanner.nextInt();
				}
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					out.print(integerArray[i][j] + " ");
				}
				out.println();
			}
			break;
		case 2:
			System.out.println("Enter the doubles' 2D array");
			double[][] doubleArray = new double[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					doubleArray[i][j] = scanner.nextDouble();

				}
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					out.print(doubleArray[i][j] + " ");
				}
				out.println();
			}
			break;
		case 3:
			System.out.println("Enter the Boolean array");
			boolean[][] booleanArray = new boolean[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					booleanArray[i][j] = scanner.nextBoolean();
				}
			}
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					out.print(booleanArray[i][j] + " ");
				}
				out.println();
			}
			break;
		}
		out.flush();
		out.close();

	}

	/************************* Sum Equal to zero *************************/
	int Number;

	public int[] getDataSum() {
		System.out.println("Enter the number of integers");
		Number = scanner.nextInt();
		int[] integerArray = new int[Number];
		System.out.println("Enter the numbers");
		for (int i = 0; i < Number; i++) {
			integerArray[i] = scanner.nextInt();
		}
		return integerArray;

	}

	public void findingTriplets(int Array[]) {
		int count = 0;
		int length = Array.length;

		for (int i = 0; i < length - 2; i++) {
			for (int j = 1 + i; j < length - 1; j++) {
				for (int k = 1 + j; k < length; k++) {
					if (Array[i] + Array[j] + Array[k] == 0) {
						count++;
						System.out.println(Array[i] + "," + Array[j] + "," + Array[k]);
					}
				}
			}
		}
		System.out.println(count);
	}

	/****************** Distance problem ********************/
	int x;
	int y;

	public void getCoordinates() {
		System.out.println("Enter x and y");
		x = scanner.nextInt();
		y = scanner.nextInt();
		distance(x, y);

	}

	public double distance(int a, int b) {
		Double x = Double.valueOf(a);
		Double y = Double.valueOf(b);
		double base = x;
		double exp = 2;
		double xsquare = Math.pow(base, exp);
		double base1 = y;
		double exp1 = 2;
		double ysquare = Math.pow(base1, exp1);
		double sumOfSquares = xsquare + ysquare;
		double distance = Math.sqrt(sumOfSquares);

		System.out.println("Eucledian distance between (x,y) and origin is " + distance);

		return distance;

	}

	/******************* Permutations of a string **********************/

	/******************** Stopwatch problem *************************/
	public double stopWatch() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			i = i + 1;

		}
		long elapsedTime = System.currentTimeMillis() - startTime;
		return elapsedTime;

	}

	/******************* Quadratic problem ************************/
	int a;
	int b;
	int c;

	public void getQuadraticData() {
		System.out.println("Enter the value of a,b and c");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		double delta = (b * b) - (4 * a * c);
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("The two roots are : " + x1 + " and " + x2);
	}

	/*********************** Windchill problem ******************/
	double t, v;

	public void windChill() {
		System.out.println("ENter t and v ");
		t = scanner.nextDouble();
		v = scanner.nextDouble();
		double w;
		double base = v;
		double exp = 0.16;
		w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(base, exp));
		System.out.println("Wind chill is  " + w);
	}

	/*********** Algorithmic Programs *****************/

	/********** Anagram Detection ******************/
	public void anagramDetection() {
		System.out.println("Enter the strings you want to compare");
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		first = first.replaceAll("\\s", "");
		second = second.replaceAll("\\s", "");
		first = first.toLowerCase();
		second = second.toLowerCase();
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		if (firstArray.length != secondArray.length)
			System.out.println("Not Anagrams!");
		else {
			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			if (Arrays.equals(firstArray, secondArray))
				System.out.println("Anagrams");
			else
				System.out.println("Anagrams");
		}

	}

	/***** Prime numbers *********/
	ArrayList<Integer> arrli = new ArrayList<Integer>();

	public ArrayList<Integer> primeNumbers() {

		System.out.println("The prime numbers are:");
		for (int i = 2; i < 1000; i++) {
			if (primeChecker(i)) {
				arrli.add(i);
				System.out.println(i + ",");
			}
		}
		return arrli;

	}

	public boolean primeAnagramDetection(String first, String second) {
		first = first.replaceAll("\\s", "");
		second = second.replaceAll("\\s", "");
		first = first.toLowerCase();
		second = second.toLowerCase();
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		if (firstArray.length != secondArray.length)
			return false;
		else {
			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			if (Arrays.equals(firstArray, secondArray))
				return true;
			else
				return false;
		}

	}

	public void anagramCheck(ArrayList<Integer> arrli) {
		System.out.println("Anagrams are: ");
		for (int i = 0; i < arrli.size() - 1; i++) {
			for (int j = i + 1; j < arrli.size(); j++) {
				if (primeAnagramDetection(arrli.get(i).toString(), arrli.get(j).toString())) {
					System.out.println("(" + arrli.get(i) + "," + arrli.get(j) + ")");
				}
			}
		}
	}

	public void palindromeCheck(ArrayList<Integer> arrli) {
		String array[] = new String[arrli.size()];
		for (int i = 0; i < arrli.size(); i++) {
			array[i] = arrli.get(i).toString();
		}
		System.out.println("The palindrome numbers are: ");
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			String a = array[i];
			int x = 0, y = a.length() - 1;
			while (x <= y) {
				if (a.charAt(x) != a.charAt(y))
					flag = false;
				x++;
				y--;
			}
			if (flag == true)
				System.out.println(a);

		}
	}

	public boolean primeChecker(int n) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				flag = false;
				return flag;
			}
		}
		return flag;
	}

	/*******************
	 * Searching and sorting
	 * 
	 * @return
	 ***************/
	public int getZ() {
		return scanner.nextInt();

	}

	public int getValue() {
		return scanner.nextInt();
	}

	public String getStringValue() {
		return scanner.next();
	}

	public Integer[] getIntegerArray() {
		System.out.println("Enter the number of integers");
		int n = scanner.nextInt();
		Integer[] arr = new Integer[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public String[] getStringArray() {
		System.out.println("Enter the number of Strings");
		int n = scanner.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.next();
		}
		return arr;

	}

	public <T extends Comparable<T>> boolean binarySearch(T[] arr, T value, int low, int high) {
		int mid = low + (high - low) / 2;
		while (low < high) {
			Arrays.sort(arr);

			if (arr[mid].compareTo(value) > 0)
				return binarySearch(arr, value, low, mid - 1);
			if (arr[mid].compareTo(value) < 0)
				return binarySearch(arr, value, mid + 1, high);
			if (arr[mid].compareTo(value) == 0)
				return true;
		}
		return false;
	}

	/******** Sorting *********/
	public <T extends Comparable<T>> T[] insertionSort(T[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1].compareTo(arr[j]) > 0) {
					T temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;

	}

	public <T extends Comparable<T>> T[] bubbleSort(T[] arr) {
		int n = arr.length;
		T temp;
		boolean swap = true;
		for (int i = 0; i < n; i++) {
			swap = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false)
				break;
		}
		return arr;
	}
	/*********** Finding Your Number ***********/
	public int getN(){
		return scanner.nextInt();
	}
	public void binarySearch(int low,int high){
		int mid = low+(high-low)/2;
		
	}

}
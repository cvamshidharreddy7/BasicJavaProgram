
package com.jda.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.xml.soap.Node;

import com.jda.functionalprograms.PowersOfTwo;

/**
 *  @author 1022279
 * @version 1.0
 * @since 4-07-2017 
 *
 */
public class Utility {
	Scanner scanner;

	/*
	 * Constructor
	 */
	public Utility() {
		scanner = new Scanner(System.in);
	}

	/*
	 * Method to get the input name.
	 */
	public String inputName() {
		return scanner.next();
	}

	/*
	 * Method to replace string
	 */
	public String replaceString(String x, String name) {
		x = x.replaceAll("<<UserName>>", name);
		return x;

	}
	/*
	 * Method to get number as input
	 */

	public int numberOfFlips() {
		return scanner.nextInt();
	}

	/*
	 * Random number generator
	 */
	public double randomNumberGenerator() {
		return Math.random();
	}

	/*
	 * Method to get the year
	 */
	public int getYear() {
		return scanner.nextInt();
	}

	/*
	 * Method to check leap year.
	 */
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

	/*
	 * Method to get the months.
	 */
	public String[] getMonths() {
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		return months;
	}

	/*
	 * Method to get days.
	 */
	public int[] getDays() {
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return days;
	}

	/*
	 * Method to get the input number.
	 */
	public int inputNumber() {
		return scanner.nextInt();
	}

	PowersOfTwo powersOfTwo = new PowersOfTwo();
	int power = 1;

	/*
	 * Method to get the power
	 */
	public int getPower(int number) {
		power = power * 2;
		return power;
	}

	/*
	 * Method to get the inverse.
	 */
	public double getInverse(int number) {
		Double number1 = Double.valueOf(number);

		return 1 / number1;
	}

	double harmonicNumber = 0;

	/*
	 * MEthod to get the harmonic value
	 */
	public double harmonicValue(int number) {
		for (int i = 1; i <= number; i++) {
			harmonicNumber += getInverse(i);
		}
		return harmonicNumber;
	}

	int numberOfTwos = 0;

	/*
	 * Method to make the number as odd one.
	 */
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

	/*
	 * Method to get the prime factorisation of a number
	 */
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
	/*
	 * Method to get the stake as an input.
	 */
	public int getStake() {
		return scanner.nextInt();
	}

	/*
	 * Method to get the goal as an input.
	 */
	public int getGoal() {
		return scanner.nextInt();
	}

	/*
	 * MEthod to get the number as an input
	 */
	public int getNumber() {
		return scanner.nextInt();
	}

	/*
	 * MEthod to implement gambling algorithm
	 */
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

	/*
	 * Coupon problem
	 */
	int total;
	int number;

	public int[] getNumbers() {
		ArrayList<Integer> arrLi = new ArrayList<Integer>();
		/*
		 * System.out.println("Please enter the numbers and enter -1 to stop");
		 * while(scanner.nextInt() != -1){ arrLi.add(scanner.nextInt()); } int[] arr =
		 * new int[arrLi.size()]; for(int i=0;i<arrLi.size();i++){
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

	/*
	 * Method to generate random number
	 */
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

	/*
	 * 
	 * 
	 * Two D Array
	 * 
	 * 
	 * 
	 */
	int M;
	int N;
	int dataType;

	/*
	 * Method to get the data.
	 */
	public void getData() {
		System.out.println("Enter number of rows");
		M = scanner.nextInt();
		System.out.println("Enter number of columns");
		N = scanner.nextInt();
		System.out.println("Enter the datatype");
		dataType = scanner.nextInt();
	}

	/*
	 * Method to implement the switch statement Printwriter class is used
	 */
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

	/*
	 * ************************ Sum Equal to zero ************************
	 *
	 */
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

	/*
	 * Method to get triplets which add to zero
	 */
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

	/*
	 * ***************** Distance problem *******************
	 */
	int x;
	int y;

	public void getCoordinates() {
		System.out.println("Enter x and y");
		x = scanner.nextInt();
		y = scanner.nextInt();
		distance(x, y);

	}

	/*
	 * Method to calculate distance between two points
	 */
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

	/*
	 * ****************** Permutations of a string *********************
	 */

	/*
	 * ******************* Stopwatch problem ************************
	 */
	/*
	 * Method to calculate elapsed time
	 */
	public double stopWatch() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000000; i++) {
			i = i + 1;

		}
		long elapsedTime = System.currentTimeMillis() - startTime;
		return elapsedTime;

	}

	/*
	 * ****************** Quadratic problem ***********************
	 */
	int a;
	int b;
	int c;

	/*
	 * Method to get the roots.
	 */
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

	/*
	 * ********************** Windchill problem *****************
	 */
	double t, v;

	/*
	 * MEthod to calculate the windchill
	 */
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

	/*
	 * ******************* Algorithmic Programs **************************
	 */

	/*
	 * ********* Anagram Detection *****************
	 */

	/*
	 * Method to check whether the given strings are anagrams or not.
	 */
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

	/*
	 * **** Prime numbers ********
	 */
	ArrayList<Integer> arrli = new ArrayList<Integer>();

	/*
	 * Method to print the prime numbers
	 */
	public void primePrint(ArrayList<Integer> arrLi) {
		System.out.println("The prime numbers are:");
		for (int i = 0; i < arrLi.size(); i++) {
			System.out.println(arrLi.get(i));
		}
	}

	/*
	 * MEthod to get the prime numbers in a given range
	 */
	public ArrayList<Integer> primeNumbers() {

		for (int i = 2; i < 1000; i++) {
			if (primeChecker(i)) {
				arrli.add(i);
				// System.out.println(i + ",");
			}
		}
		return arrli;

	}

	/*
	 * Method to check if two primes are anagrams.
	 */
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

	/*
	 * Method to print the anagrams
	 */
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

	/*
	 * Method to check the palindromes
	 */
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
	/*
	 * MEthod to check if a number is a prime
	 */

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

	/*
	 * Searching and sorting
	 * 
	 */

	/*
	 * Method to get the value of z
	 */
	public int getZ() {
		return scanner.nextInt();

	}

	/*
	 * Method to get the value.
	 */
	public int getValue() {
		return scanner.nextInt();
	}

	/*
	 * Method to get the string value
	 */
	public String getStringValue() {
		return scanner.next();
	}

	/*
	 * Method to get the integer array from scanner
	 */
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

	/*
	 * Method to get string array from scanner
	 */
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

	/*
	 * Generic method for binary search
	 */
	public <T extends Comparable<T>> boolean binarySearch(T[] arr, T value, int low, int high) {
		int mid = low + (high - low) / 2;
		while (low <= high) {
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

	/*
	 * ******* Sorting *********
	 */

	/*
	 * Generic insertion sort method
	 */
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

	/*
	 * Generic bubble sort method
	 */
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

	/*
	 * ********** Finding Your Number **********
	 */
	/*
	 * Method to get the value of N
	 */
	public int getN() {
		return scanner.nextInt();
	}

	/*
	 * Binary search for ints
	 */
	public int binarySearch(int low, int high) {
		int mid = low + (high - low) / 2;
		boolean var;
		int range = high - low;
		while (range > 1) {
			System.out.println("mid is  " + mid);
			System.out.println("Ask if it's between low and mid");
			var = scanner.nextBoolean();
			if (var) {
				System.out.println("Now the range is:" + low + " , " + mid);
				return binarySearch(low, mid);
			} else {
				System.out.println("Now the range is " + (mid + 1) + " , " + high);
				return binarySearch(mid + 1, high);
			}
		}
		System.out.println("Ask if it's equal to low");
		var = scanner.nextBoolean();
		if (var)
			System.out.println("The number you guessed is " + low);
		else
			System.out.println("The number you guessed is " + high);
		return 0;
	}

	/*
	 * ******** Binary search the word from the list ********
	 */
	/*
	 * Method to get the word
	 */
	public String getWord() {
		return scanner.next();
	}

	/*
	 * ****** Merge Sort *******
	 */
	public String[] mergeSort(String[] arr, int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
		return arr;
	}

	/*
	 * Method for merging to arrays
	 */
	public void merge(String arr[], int low, int mid, int high) {
		int s1 = mid - low + 1;
		int s2 = high - mid;
		String L[] = new String[s1];
		String R[] = new String[s2];
		for (int i = 0; i < s1; i++)
			L[i] = arr[low + i];
		for (int i = 0; i < s2; i++)
			R[i] = arr[mid + 1 + i];
		int x = 0, y = 0, z = low;
		while (x < s1 && y < s2) {
			if (L[x].compareTo(R[y]) <= 0) {
				arr[z] = L[x];
				x++;
			} else {
				arr[z] = R[y];
				y++;
			}
			z++;
		}
		while (x < s1) {
			arr[z] = L[x];
			x++;
			z++;
		}
		while (y < s2) {
			arr[z] = R[y];
			y++;
			z++;
		}
	}

	/*
	 * **** Vending Machine ******
	 */
	/*
	 * Method to get the value of change
	 */
	public int getChange() {
		return scanner.nextInt();
	}

	/*
	 * public int vending(int[] arr, int[] count, int value, int high, int index,
	 * int index2) { // Initially high=1000;
	 * 
	 * while (value - high >= 0) { value = value - high; count[index]++; } index2--;
	 * high = arr[index2]; index--; return vending(arr, count, value, high, index,
	 * index2); }
	 */

	/*
	 * Method to get the number of notes
	 */
	public int[] vending(int[] notes, int change) {

		int[] numberofnotes = new int[notes.length];
		for (int i = notes.length - 1; i >= 0; i--) {
			if (change / notes[i] >= 1) {
				int x = change / notes[i];
				numberofnotes[i] = x;
				change = change - ((int) (change / notes[i]) * notes[i]);
			}
		}
		return numberofnotes;
	}

	/*
	 * ****** Day of the week *******
	 */

	/*
	 * Methods for getting month,date and year.
	 */
	public int getMonth() {
		return scanner.nextInt();
	}

	public int getDay() {
		return scanner.nextInt();
	}

	public int getYear1() {
		return scanner.nextInt();
	}

	/*
	 * Method to get the day of the week from the given inputs
	 */
	public int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + m0 * 31 / 12) % 7;
		return d0;
	}

	/*
	 * ***** Temperature conversion ******
	 */

	/*
	 * Method to get the temparature
	 */
	public Double getTemperature() {
		return scanner.nextDouble();
	}

	/*
	 * Method to convert temperature from one unit to other.
	 */
	public Double convertTemperature(Double temp, int value) {
		double temperature;
		if (value == 1) {
			temperature = (temp * 9 / 5) + 32;
		} else {
			temperature = (temp - 32) * 5 / 9;
		}
		return temperature;
	}

	/*
	 * *** Monthly payment ******
	 */

	/*
	 * Methods to get the P,Y,R
	 */
	public Double getP() {
		return scanner.nextDouble();
	}

	public Double getY() {
		return scanner.nextDouble();
	}

	public Double getR() {
		return scanner.nextDouble();
	}

	/*
	 * Method to get the payment from the given data
	 */
	public Double getPayment(Double P, Double Y, Double R) {
		Double n = 12 * Y;
		Double r = R / (12 * 100);
		Double den = 1 - Math.pow((1 + r), -n);
		Double payment = (P * r) / den;
		return payment;
	}

	/*
	 * **** Sqrt ****
	 */

	/*
	 * Method to get the square root
	 */
	public Double getSqrt(Double c) {
		double t = c;
		while (Math.abs(t - (c / t)) > (1e-15) * t) {
			t = ((c / t) + t) / 2;
		}
		return t;
	}

	/*
	 * **** To Binary ****
	 */

	/*
	 * Method to get the binary number.
	 */
	public Integer[] getBinary(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		ArrayList<Integer> arrli = new ArrayList<Integer>();

		for (int j = i - 1; j >= 0; j--)
			arrli.add(binaryNum[j]);
		Integer arr[] = arrli.toArray(new Integer[arrli.size()]);
		return arr;
	}

	/*
	 * *** Swappping Nibbles *****
	 */

	/*
	 * Method to swap nibbles
	 */

	public int[] swapNibbles(int n) {
		Integer[] arr = getBinary(n);
		int[] array = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i].intValue();
		}
		int[] result = new int[8];
		int[] array1 = new int[4];
		int[] array2 = new int[4];

		for (int i = arr.length - 1, j = 3; j >= 0; i--, j--) {
			array1[j] = arr[i];
		}
		int k = 3;
		for (int i = array.length - 5; i >= 0; i--, k--) {
			array2[k] = array[i];
		}
		while (k >= 0) {
			array2[k] = 0;
			k--;
		}
		for (int l = 0; l < 4; l++) {
			result[l] = array1[l];
		}
		for (int l = 0; l < 4; l++) {
			result[l + 4] = array2[l];
		}
		return result;
	}

	/*
	 * ******** Data Structures *********
	 */
	/*
	 * 
	 * UnOrdered list
	 * 
	 * @param <T>
	 *
	 */
	/*
	 * @author 1022279
	 *
	 *Linked list class
	 *
	 * @param <T>
	 */
	public class LinkedList<T> {
		Node head;

		public class Node {
			T data;
			Node next;

			public Node(T d) {
				data = d;
				next = null;
			}
		}

		/**
		 * @param newData
		 * Method  for pushing data.
		 */
		public void push(T newData) {
			Node newNode = new Node(newData);
			newNode.next = head;
			head = newNode;
		}

		/**
		 * Method for printing linked list
		 */
		public void print() {
			Node n = head;
			while (n != null) {
				System.out.println(n.data + " ");
				n = n.next;
			}
		}
	}

	/*
	 * ******* Binary Search Tree ******
	 */
	/**
	 * @param n
	 * 
	 * Method for calculating factorial
	 * 
	 * @return
	 */
	public long factorial(int n) {
		long res = 1;
		for (int i = 1; i <= n; ++i) {
			res *= i;
		}
		return res;
	}

	/**
	 * Method for calculating caefficient
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public long coefficient(int n, int k) {
		long res = 1;
		if (k > n - k)
			k = n - k;
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

	/**
	 * 
	 * Method for calculating Catalan Number which is the count for number of Binary Search Trees
	 * @param n
	 * @return
	 */
	public long catalanNumber(int n) {

		long c = coefficient(2 * n, n);
		return c / (n + 1);
	}

}
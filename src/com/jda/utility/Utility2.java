package com.jda.utility;

import java.util.Scanner;

public class Utility2 {
		Scanner scanner ;
		public Utility2(){
			scanner = new Scanner(System.in);
		}
		public int numberOfFlips() {
			return scanner.nextInt();
		}
		public double randomNumberGenerator(){
			return Math.random();
		}
		
}

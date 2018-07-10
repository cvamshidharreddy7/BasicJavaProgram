package com.jda.Algorithmprograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class PrimeNumbersAnagrams {
		public static void main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			
			
			arrli =	utility.primeNumbers();
			utility.anagramCheck(arrli);
			
			
		}
}

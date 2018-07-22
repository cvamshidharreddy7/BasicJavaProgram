package com.jda.Algorithmprograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrimeNumbersAnagrams {
		/**
		 * @param args
		 */
		public static void main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			
			
			arrli =	utility.primeNumbers();
			utility.anagramCheck(arrli);
			
			
		}
}

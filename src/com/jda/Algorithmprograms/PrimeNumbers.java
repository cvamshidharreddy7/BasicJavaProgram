package com.jda.Algorithmprograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrimeNumbers {
		/**
		 * @param args
		 */
		public static void  main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrLi = new ArrayList<Integer>();
			arrLi = utility.primeNumbers();
			utility.primePrint(arrLi);
		}
}

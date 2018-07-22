package com.jda.Algorithmprograms;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class PrimeNumbers {
		public static void  main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrLi = new ArrayList<Integer>();
			arrLi = utility.primeNumbers();
			utility.primePrint(arrLi);
		}
}

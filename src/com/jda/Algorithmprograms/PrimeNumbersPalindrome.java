package com.jda.Algorithmprograms;

import com.jda.utility.Utility;
import java.util.ArrayList;

public class PrimeNumbersPalindrome {
	public static void main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			
			
				arrli =	utility.primeNumbers();
				utility.palindromeCheck(arrli);
	}
			
}

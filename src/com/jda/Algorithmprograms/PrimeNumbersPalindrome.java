package com.jda.Algorithmprograms;

import com.jda.utility.Utility;
import java.util.ArrayList;

/**
 * @author 1022279
 *
 */
public class PrimeNumbersPalindrome {
	/**
	 * @param args
	 */
	public static void main(String[] args){
			Utility utility = new Utility();
			ArrayList<Integer> arrli = new ArrayList<Integer>();
			
			
				arrli =	utility.primeNumbers();
				utility.palindromeCheck(arrli);
	}
			
}

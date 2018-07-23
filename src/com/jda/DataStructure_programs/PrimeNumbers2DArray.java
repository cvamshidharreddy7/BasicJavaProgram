package com.jda.DataStructure_programs;

import java.util.ArrayList;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrimeNumbers2DArray {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		String[][] primeNumbers = new String[10][30];
		Utility utility = new Utility();
		ArrayList<Integer> arrLi = utility.primeNumbers();
		int x=0,y=0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				primeNumbers[i][j] = " ";

			}
		}
		for(int i=0;i<arrLi.size();i++) {
			if(x != (arrLi.get(i))/100) {
				x=(arrLi.get(i))/100;
				y=0;
			}
			primeNumbers[x][y]=Integer.toString(arrLi.get(i));
			y++;
		}
		System.out.println("The prime numbers' array is");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 30; j++) {
				System.out.print(primeNumbers[i][j]+"  ");
			}
			System.out.println();
			}
	}
}

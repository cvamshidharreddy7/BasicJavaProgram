package com.jda.DataStructure_programs;

import java.util.ArrayList;

import com.jda.utility.Utility;

public class PrimeAnagrams {

	public static void main(String args[]) {
		Utility utility = new Utility();
		ArrayList<Integer> arrLi = utility.primeNumbers();
		ArrayList<Integer> arrLi2 = utility.primeNumbers();
		String[][] primenumbers = new String[10][30];
		int x = 0;
		int y = 0;

		String[][] primeAnagram = new String[1000][2];

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 2; j++) {
				primeAnagram[i][j] = " ";

			}
		}

		for (int i = 0; i < arrLi.size(); i++) {
			for (int j = i + 1; j < arrLi.size(); j++) {
				boolean flag = utility.primeAnagramDetection(Integer.toString(arrLi.get(i)),
						Integer.toString(arrLi.get(j)));
				if (flag) {
					primeAnagram[x][y] = Integer.toString(arrLi.get(i));
					primeAnagram[x][y + 1] = Integer.toString(arrLi.get(j));
					x++;
					y = 0;
					arrLi2.remove(arrLi.get(i));
					arrLi2.remove(arrLi.get(j));

				}

			}

		}
		int j;
		System.out.println("The prime anagram pairs are:");
		for (int i = 0; i < 100; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(primeAnagram[i][j] + " ");
			}
			System.out.println();
		}
		x = 0;
		y = 0;
		System.out.println("The primes which aren't anagrams are:");
		for (int i = 0; i < arrLi2.size(); i++) {
			if (x != (arrLi2.get(i) / 100)) {
				x = (arrLi2.get(i) / 100);
				y = 0;
			}
			primenumbers[x][y] = Integer.toString(arrLi2.get(i));
			y++;
		}

		for (int i = 0; i < 10; i++) {
			for (j = 0; j < 30; j++) {
				if (primenumbers[i][j] == null)
					System.out.print(" ");
				else
					System.out.print(primenumbers[i][j] + "  ");

			}
			System.out.println();
		}
	}
}
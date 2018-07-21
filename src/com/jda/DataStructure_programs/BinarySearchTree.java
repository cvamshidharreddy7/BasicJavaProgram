package com.jda.DataStructure_programs;

import com.jda.utility.Utility;

public class BinarySearchTree {
		public static void main(String[] args) {
			Utility utility =  new Utility();
			System.out.println("Enter the number of attemps");
			int n= utility.getN();
			long[] number = new long[n];
			int x;
			for(int i=0;i<n;i++) {
				System.out.println("Enter the number of nodes");
				x = utility.getNumber();
				number[i] = utility.catalanNumber(x);				
			}
			for(int i=0;i<n;i++) {
				System.out.println("NUmber of BSTs possible are: "+number[i]);
			}
		}
}

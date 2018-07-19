package com.jda.DataStructure_programs;

import com.jda.utility.Queue;
import com.jda.utility.Utility;

public class Banking {
	public static void main(String[] args) {
		Utility utility = new Utility();
		Queue<Integer> q = new Queue<Integer>();
		System.out.println("Enter the number of customers ");
		int n=utility.getN();
		int value;
		int amount;
		 int totalAmount;
		System.out.println("Enter the initial amount");
		totalAmount=utility.getNumber();
		for(int i=0;i<n;i++) {			
			System.out.println("Enter the value-1 for Deposit,-2 for Withdrawl");
			value=utility.getValue();
			System.out.println("Enter the amount ");
			amount = utility.getChange();
		totalAmount =	q.enqueue(amount, value,totalAmount);
		}
		System.out.println("Total amount at the end is: " + totalAmount);
		//q.print();		
	}

}

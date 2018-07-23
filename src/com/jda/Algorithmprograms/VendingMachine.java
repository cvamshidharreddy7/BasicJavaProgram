package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class VendingMachine {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.println("Enter the Change's value");
			int value = utility.getChange();
			int[] arr= {1,2,5,10,50,100,500,1000};
			/*int[] count = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				count[i] =0;
			}
			
			int high=1000;
			int index = arr.length-1;
			int index2 = arr.length-1;
			utility.vending(arr, count, value, high, index, index2);
			for(int i=0;i<count.length;i++) {
				System.out.print(count[i] + " , ");
			}
			System.out.println();		
		*/
		int[] numberOfNotes = utility.vending(arr,value);
		int count =0;
		for(int i=0;i<numberOfNotes.length;i++) {
			if(numberOfNotes[i]>0){
				count+=numberOfNotes[i];
				System.out.println("Number of notes of "+arr[i]+":"+numberOfNotes[i]);
			}
		}
		System.out.println("Total notes used : "+count);
		}	
}

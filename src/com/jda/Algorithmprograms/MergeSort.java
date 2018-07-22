package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class MergeSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		String[] arr = utility.getStringArray();
		int low =0;
		int high = arr.length-1;
		utility.mergeSort(arr, low, high);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		}
}

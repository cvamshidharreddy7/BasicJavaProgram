package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class InsertionSort {
	Utility utility = new Utility();
	/**
	 * @param args
	 */
	public static void main(String[] args){
		Utility utility = new Utility();
		int z;
		System.out.println("Integer-1 andString -2");
		z = utility.getZ();
			if(z==1){
				
			Integer[] arr = utility.getIntegerArray();
			Integer[] sortedArray = utility.insertionSort(arr);
			for(int i=0;i<sortedArray.length;i++){
				System.out.println(sortedArray[i]);
			}
		
		}
		if(z==2){
			String[] arr = utility.getStringArray();
			String[] sortedArray = utility.insertionSort(arr);
			for(int i=0;i<sortedArray.length;i++){
				System.out.println(sortedArray[i]);
			}
		}
		
	}
}

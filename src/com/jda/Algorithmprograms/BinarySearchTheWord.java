package com.jda.Algorithmprograms;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.jda.utility.Utility;

public class BinarySearchTheWord {
	

	public static void main(String[] args) throws FileNotFoundException{
		Utility utility = new Utility();
		
		File file = new File("C:\\Users\\1022279\\Desktop\\BinarySearchTheWord.txt");
		Scanner scanner = new Scanner(file);
		ArrayList<String> arrli = new ArrayList<String>();
		while(scanner.hasNext()) {
			
			arrli.add(scanner.next());
			
		}
		String[] arr =new String[arrli.size()];
		arr = arrli.toArray(arr);
		utility.insertionSort(arr);
		System.out.println("ENter the word you want to search for");
		String word = utility.getWord();
		int low=0;
		int high= arr.length-1;
		System.out.println(utility.binarySearch(arr, word, low, high));
		
		

		}
	
}

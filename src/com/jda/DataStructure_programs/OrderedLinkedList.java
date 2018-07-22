package com.jda.DataStructure_programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class OrderedLinkedList {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		OrderedList<Integer> list = new OrderedList<Integer>();
		ArrayList<Integer> arrLi = new ArrayList<Integer>();
		Utility utility = new Utility();
		System.out.println("ENter the number you want to number for:");
		int number = utility.getN();
		File file = new File("C:\\Users\\1022279\\Desktop\\OrderedList.txt");
		Scanner scanner = new Scanner(file);
		//ArrayList<String> arrli = new ArrayList<String>();
		while(scanner.hasNext()) {
			arrLi.add(Integer.parseInt(scanner.next()));
		}
		
		Integer[] arr = new Integer[arrLi.size()];
		System.out.println("The file intially is");
		arr = arrLi.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		list.removeAt(number);

		System.out.println("The final ordered linked  list is:");
		list.print();
		scanner.close();
	}
}
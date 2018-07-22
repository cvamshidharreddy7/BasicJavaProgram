package com.jda.DataStructure_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.jda.utility.OrderedList;
import com.jda.utility.Utility;

/**
 * Class for creating slots using hashing
 * @author 1022279
 *
 */
public class NumberInASlot {
	public static void main(String[] args)  throws FileNotFoundException{
		Utility utility = new Utility();
		File file = new File("C:\\Users\\1022279\\Desktop\\NumberInASlot.txt");
		Scanner scanner = new Scanner(file);
		System.out.println("Enter the number you want to search for:");
		int n = utility.getN();
		ArrayList<Integer> arrLi = new ArrayList<Integer>();
		while(scanner.hasNext()) {
			arrLi.add(Integer.parseInt(scanner.next()));
		}
		HashMap<Integer, OrderedList<Integer>> slot = new HashMap<>();
		for (int i = 0; i < 11; i++) {
			slot.put(i, null);
		}
		
		Integer[] arr = new Integer[arrLi.size()];
		
		arr = arrLi.toArray(arr);
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			Integer remainder = arr[i] % 11;
			if (slot.get(remainder) == null) {
				OrderedList<Integer> list = new OrderedList<Integer>();
				slot.put(remainder, list);
				list.orderedAdd(arr[i]);
			} else {
				slot.get(remainder).orderedAdd(arr[i]);
			}
		}
		System.out.println("the slots intially are:");

		for (int i = 0; i < arr.length; i++) {
			if (slot.get(i) == null)
				System.out.println("Slot-" + i+":Slot is empty");
			else {
				System.out.print("Slot-" + i+":");
				slot.get(i).print();
			}

		}
		int remainderValue = n % 11;
		slot.get(remainderValue).removeAt(n);
		System.out.println();
		System.out.println("The slot after edit is");
		for (int i = 0; i < arr.length; i++) {
			if (slot.get(i) == null)
				System.out.println("Slot-" + i+":Slot is empty");
			else {
				System.out.print("Slot-" + i+":");
				slot.get(i).print();
			}

		}
	}
}
package com.jda.DataStructure_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.jda.utility.OrderedLinkedList;
import com.jda.utility.UnOrderedLinkedList;
import com.jda.utility.Utility;

public class OrderedList {
	public static void main(String[] args) throws FileNotFoundException{
		Utility utility = new Utility();
		File file = new File("C:\\Users\\1022279\\Desktop\\OrderedList.txt");
		Scanner scanner = new Scanner(file);
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		while(scanner.hasNext()) {
			arrli.add(scanner.nextInt());
		}
		OrderedLinkedList<Integer> linkedList = new OrderedLinkedList<Integer>();
		for(int i=0;i<arrli.size();i++) {
			linkedList.add(arrli.get(i));
		}
		System.out.println("Linked list is: ");
		linkedList.print();
		int initialSize = linkedList.getSize();
		System.out.println("Initial size is " + initialSize);
		System.out.println("Enter the number you want to search for: ");
		int num = scanner.nextInt();
		linkedList.remove(num);
		int sizeAfterRemoval = linkedList.getSize();
		System.out.println("Size after removal is: " + sizeAfterRemoval );
		if(sizeAfterRemoval != initialSize) {
			System.out.println("Number already exists!");
			
		}
		else {
			linkedList.add(num);
			System.out.println("Number doesn't exist");
		}
		System.out.println("Linked list at the end is: ");
		linkedList.print();
		
	scanner.close();
	}
}
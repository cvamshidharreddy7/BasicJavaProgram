package com.jda.DataStructure_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.jda.utility.UnOrderedLinkedList;
import com.jda.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) throws FileNotFoundException{
		Utility utility = new Utility();
		File file = new File("C:\\Users\\1022279\\Desktop\\LinkedList.txt");
		Scanner scanner = new Scanner(file);
		ArrayList<String> arrli = new ArrayList<String>();
		while(scanner.hasNext()) {
			arrli.add(scanner.next());
		}
		UnOrderedLinkedList<String> linkedList = new UnOrderedLinkedList<String>();
		for(int i=0;i<arrli.size();i++) {
			linkedList.add(arrli.get(i));
		}
		
		
		int initialSize = linkedList.getSize();
		System.out.println("Initial size is " + initialSize);
		linkedList.print();
		System.out.println("Enter the word you want to search for");
		String word = utility.getWord();
		System.out.println();
		linkedList.remove(word);
		System.out.println("Linked list now is: ");
		linkedList.print();
		int sizeAfterRemoval=linkedList.getSize();
		System.out.println("size after removal is " + sizeAfterRemoval);
		if(sizeAfterRemoval != initialSize) {
			System.out.println("Word already exists!");
			
		}
		else {
			linkedList.add(word);
			System.out.println("Word doesn't exist");
		}
		System.out.println("Linked list now is: ");
		linkedList.print();
		
		PrintStream o = new PrintStream(new File("A.txt"));
		PrintStream console = System.out;
		System.setOut(o);
		
	scanner.close();
	}
}

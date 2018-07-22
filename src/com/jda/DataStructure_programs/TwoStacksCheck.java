package com.jda.DataStructure_programs;

import java.util.Scanner;

import com.jda.utility.QueueUsing2Stacks;
import com.jda.utility.Stack;

public class TwoStacksCheck {
	public static void main(String[] args) {
		String inputString;
		System.out.println("Enter the input string ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		QueueUsing2Stacks<String> stack = new QueueUsing2Stacks<String>();
		for(int i=0;i<inputString.length();i++) {
			stack.enqueue(String.valueOf(inputString.charAt(i)));
		}
		stack.print();
		System.out.println(stack.size());
		int x= stack.size();
		for(int i=0;i<x;i++) {
			System.out.print(stack.dequeue()+ ",");		
		}
		scanner.close();
	}
}

package com.jda.DataStructure_programs;

import java.util.Scanner;

import com.jda.utility.Stack;

/**
 * @author 1022279
 *
 */
public class StackCheck {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString;
		System.out.println("Enter the input string ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<inputString.length();i++) {
			stack.push(String.valueOf(inputString.charAt(i)));
		}
		for(int i=0;i<stack.size();i++) {
			System.out.print(stack.pop());
			
		}
		System.out.println();
		System.out.println(stack.size());
		
		scanner.close();
	}
}



package com.jda.DataStructure_programs;

import java.util.Scanner;

import com.jda.utility.Stack;
import com.jda.utility.UnOrderedLinkedList;

/**
 * @author 1022279
 * @version 1.0
 * @since 16/7/2018
 *
 */
public class BalancedParentheses {
	public static void main(String[] args) {
		String inputString;
		System.out.println("Enter the input string ");
		Scanner scanner =  new Scanner(System.in);
		inputString = scanner.nextLine();
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<inputString.length();i++) {
			if(inputString.charAt(i) == '(' ) stack.push(String.valueOf(inputString.charAt(i)));
			else if(inputString.charAt(i) == ')') {
				if(stack.peek()==String.valueOf('(')) stack.pop();
				else if(stack.isEmpty()) stack.push(String.valueOf(inputString.charAt(i)));				
			}
		}
	if(stack.isEmpty()) System.out.println(" Balanced ");
	else System.out.println("Not Balanced ");
	
	scanner.close();
	}
		
	}
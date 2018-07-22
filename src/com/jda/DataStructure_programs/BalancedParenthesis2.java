package com.jda.DataStructure_programs;
import com.jda.utility.Stack;
import com.jda.utility.Utility;

public class BalancedParenthesis2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the string");
		Utility utility= new Utility();
		
		String inputString = utility.getStringValue();
		Stack<Character> stack = new Stack<Character>();
		boolean check = true;
		char[] data = inputString.toCharArray();
		for (int i = 0; i < inputString.length(); i++) {
			if (data[i] == '(') {
				stack.push(data[i]);
			} else if (data[i] == ')') {
				if (!(stack.isEmpty())) {
					if (stack.pop() == '(') {
						check = true;
					} else {
						check = false;
					}
				} else {
					check = false;
					break;
				}
			}
		}
		if (stack.isEmpty()) {
			check = check && true;
		} else
			check = false;
		if(check==false) System.out.println("Not balanced");
		else System.out.println("balanced");
	}
}
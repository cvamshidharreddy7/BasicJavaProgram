package com.jda.DataStructure_programs;

import java.util.ArrayList;

import com.jda.utility.Stack;
import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrimeStack {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Utility utility = new Utility();
		ArrayList<Integer> arrLi = utility.primeNumbers();
		ArrayList<Integer> arrLi2 = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arrLi.size(); i++) {
			for (int j = i + 1; j < arrLi.size(); j++) {
				boolean flag = utility.primeAnagramDetection(Integer.toString(arrLi.get(i)),
						Integer.toString(arrLi.get(j)));
				if (flag) {
					arrLi2.add(arrLi.get(i));
					arrLi2.add(arrLi.get(j));
				}
			}
		}
		Integer[] array = new Integer[arrLi2.size()];
		array = arrLi2.toArray(array);

		for (int i = 0; i < arrLi2.size(); i++) {
			stack.push(array[i]);

		}
		System.out.println("The stack is");
		for (int i = 0; i < arrLi2.size(); i++) {
			System.out.println(stack.pop());
		}
	}
}
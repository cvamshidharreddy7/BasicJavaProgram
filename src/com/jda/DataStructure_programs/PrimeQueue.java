package com.jda.DataStructure_programs;

import java.util.ArrayList;

import com.jda.utility.Queue;
import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrimeQueue {
/**
 * @param args
 */
public static void main(String args[]) {
		
		Utility utility = new Utility();
		ArrayList<Integer> arrLi = utility.primeNumbers();
		ArrayList<Integer> arrLi2 = new ArrayList<Integer>();
		
		Queue<Integer> queue = new Queue<Integer>();
		for (int i = 0; i < arrLi.size(); i++) {
			for (int j = i + 1; j < arrLi.size(); j++) {
				boolean bool = utility.primeAnagramDetection(Integer.toString(arrLi.get(i)), Integer.toString(arrLi.get(j)));
				if (bool) {
					arrLi2.add(arrLi.get(i));
					arrLi2.add(arrLi.get(j));
				}
			}
		}
		 Integer[] intarray = new Integer[arrLi2.size()];
	        intarray = arrLi2.toArray(intarray);
	        
		for (int i = 0; i < arrLi2.size(); i++) {
			queue.enqueue(intarray[i]);

		}
		System.out.println("The queue is");
		for (int i = 0; i < arrLi2.size(); i++) {
			System.out.println(queue.dequeue().value);

		}
	}

}


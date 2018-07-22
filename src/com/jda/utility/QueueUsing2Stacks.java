
package com.jda.utility;

import com.jda.utility.Stack;

public class QueueUsing2Stacks<T extends Comparable<T>> {
	public Stack<T> stack1 = new Stack<T>();
	public Stack<T> stack2 = new Stack<T>();

	public void enqueue(T data) {
		stack1.push(data);
	}
	public int size() {
		return stack1.size();
	}
	public void print() {
		stack1.print();
	}
	public T dequeue() {
		
		if (stack1.isEmpty() && stack2.isEmpty())
			return null;
		if (stack2.isEmpty()) {
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
				
			}
		}
		

	return stack2.pop();
}}
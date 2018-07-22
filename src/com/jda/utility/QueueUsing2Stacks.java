package com.jda.utility;

public class QueueUsing2Stacks<T extends Comparable<T>> {
	public int size;
	public StackUsingArray<T> stack1;
	public StackUsingArray<T> stack2;

	public QueueUsing2Stacks(int size) {
		this.size = size;
		stack1 = new StackUsingArray<T>(this.size);
		stack2 = new StackUsingArray<T>(this.size);
	}

	public void enqueue(T data) {
		stack1.push(data);
	}

	public T dequeue() throws Exception {
		if (stack1.isEmpty() && stack2.isEmpty())
			return null;
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
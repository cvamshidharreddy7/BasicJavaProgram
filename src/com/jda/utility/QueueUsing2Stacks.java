package com.jda.utility;

/**
 * Queue implemented using two stacks
 * @author 1022279
 *
 * @param <T>
 */
public class QueueUsing2Stacks<T extends Comparable<T>> {
	public int size;
	public StackUsingArray<T> stack1;
	public StackUsingArray<T> stack2;

	/**
	 * Constructor having arguments
	 * @param size
	 */
	public QueueUsing2Stacks(int size) {
		this.size = size;
		stack1 = new StackUsingArray<T>(this.size);
		stack2 = new StackUsingArray<T>(this.size);
	}

	/**
	 * Method for enqueuqing the data
	 * @param data
	 */
	public void enqueue(T data) {
		stack1.push(data);
	}

	/**
	 * Method for dequeing the data
	 * @return
	 * @throws Exception
	 */
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
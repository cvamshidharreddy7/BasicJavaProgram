package com.jda.utility;

/**
 * Stack implemented using arrays
 * @author 1022279
 *
 * @param <T>
 */
public class StackUsingArray<T> {
	public int size;
	public T[] stackArr;
	public int top;
	/**
	 * Default constructor
	 * @param size
	 */
	public StackUsingArray(int size) {
		this.size = size;
		this.stackArr = (T[]) new Object[size];
		this.top = -1;
	}

	
	/**
	 * Method to know if the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(top==-1) return true;
		else return false;
	}

	/**
	 * Method for pushing on to the stack
	 * @param value
	 */
	public void push(T value) {
		if (this.isFull()) {
			System.out.println(("Stack is full,have to increase the capacity"));
			this.resize();
		}
		this.stackArr[++top] = value;
	}
	/**
	 * MEthod to know if the stack is full
	 * @return
	 */
	public boolean isFull() {
		if(top==size-1) return true;
		return false;
			}

	/**
	 * Method for resizing the stack
	 */
	private void resize() {
		T[] newStack = (T[]) new Object[this.size * 2];
		for (int i = 0; i < size; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.size = this.size * 2;
	}

	/**
	 * MEthod for popping the top most value
	 * @return
	 */
	public T pop() {		
		T value = this.stackArr[top--];
		return value;
	}

	/**
	 * MEthod for getting the top most value
	 * @return
	 */
	public T peek() {		
		return stackArr[top];
	}
	/**
	 * Method for getting the size
	 * @return
	 */
	public int size() {
		return this.size;
	}

}
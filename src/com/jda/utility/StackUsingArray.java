package com.jda.utility;

public class StackUsingArray<T> {
	public int size;
	public T[] stackArr;
	public int top;
	public StackUsingArray(int size) {
		this.size = size;
		this.stackArr = (T[]) new Object[size];
		this.top = -1;
	}

	
	public boolean isEmpty() {
		if(top==-1) return true;
		else return false;
	}

	public void push(T value) {
		if (this.isFull()) {
			System.out.println(("Stack is full,have to increase the capacity"));
			this.resize();
		}
		this.stackArr[++top] = value;
	}
	public boolean isFull() {
		if(top==size-1) return true;
		return false;
			}

	private void resize() {
		T[] newStack = (T[]) new Object[this.size * 2];
		for (int i = 0; i < size; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.size = this.size * 2;
	}

	public T pop() {		
		T value = this.stackArr[top--];
		return value;
	}

	public T peek() {		
		return stackArr[top];
	}
	public int size() {
		return this.size;
	}

}
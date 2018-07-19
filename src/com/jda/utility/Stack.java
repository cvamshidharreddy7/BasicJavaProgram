package com.jda.utility;
import com.jda.utility.UnOrderedLinkedList;

public class Stack<T extends Comparable> {
	UnOrderedLinkedList<T> linkedList = new UnOrderedLinkedList<T>();
	public void push(T data) {
		linkedList.add(data);
	}
	public void pop() {
		linkedList.removeLast();
	}
	public T peek() {
		return linkedList.lastValue();
	}
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	public int size() {
		return linkedList.getSize();
	}
	public void print() {
		linkedList.print();
	}
}

package com.jda.utility;
import com.jda.utility.UnOrderedLinkedList;

/**
 * Stack class
 * @author 1022279
 *
 * @param <T>
 */
public class Stack<T extends Comparable> {
	UnOrderedLinkedList<T> linkedList = new UnOrderedLinkedList<T>();
	/**
	 * Method for pushing the data
	 * @param data
	 */
	public void push(T data) {
		linkedList.add(data);
	}
	/**
	 * Method for popping from the stack
	 * @return
	 */
	public T pop() {
		T random =linkedList.lastValue();
		linkedList.removeLast();
		return random;
	}
	/**
	 * Method for getting the top most value in a stack
	 * @return
	 */
	public T peek() {
		return linkedList.lastValue();
	}
	/**
	 * Method for knowing if the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	/**
	 * Method for getting the size of the stack
	 * @return
	 */
	public int size() {
		return linkedList.getSize();
	}
	/**
	 * Method for printing the stack
	 */
	public void print() {
		linkedList.print();
	}
}

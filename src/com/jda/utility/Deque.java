package com.jda.utility;

/**
 * @author 1022279
 *@version 1.0
 *@since 16/7/2018
 * @param <T>
 */
/**
 * @author 1022279
 *
 * @param <T>
 */
public class Deque<T extends Comparable> {
     //	Queue<T> q = new Queue<T>();
	/**
	 * Unordered list object
	 */
	UnOrderedLinkedList<T> q = new UnOrderedLinkedList<T>();
	public void addFront(T item) {
	q.addFirst(item);
	}
	/**
	 * Method for adding at the end of the linked list
	 * @param item
	 */
	public void addRear(T item) {
		q.add(item);
	}
	/**
	 * Method for removing the first node of the deque
	 * @return
	 */
	public T removeFront() {
		T frontValue = q.firstValue();
		q.removeFirst();
		return frontValue;
	}
	/**
	 * Method for removing from the end of the linked list
	 * @return
	 */
	public T removeRear() {
		T rearValue = q.lastValue();
		q.removeLast();
		return rearValue;
	}
	/**
	 * Method to check if deque is empty
	 * @return
	 */
	public boolean isEmpty() {
		if(q.getSize()==0) return true;
		else return false;
	}
	
	/**
	 * Method for calculating the size of deque
	 * @return
	 */
	public int size() {
		return q.getSize();		
	}
	/**
	 * Method for printing the deque
	 */
	public void print() {
		q.print();
	}
	/**
	 * Method for getting the data in the front node of the deque
	 * @return
	 */
	public T getFrontData() {
		return q.firstValue();
	}
	/**
	 * Method for getting the data in the last node of the deque
	 * @return
	 */
	public T getLastData() {
		return q.lastValue();
	}
	
}

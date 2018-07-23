package com.jda.utility;

/**
 * @author 1022279
 * Queue class
 * @param <T>
 */
public class Queue<T extends Comparable<T>> {
	public Node<T> first = null;
	public Node<T> last = null;

	public static class Node<T> {
		public T value;
		public Node<T> next;
		public String var = null;

		/**
		 * Default Constructor
		 * @param data
		 */
		Node(T data) {
			value = data;
			next = null;
		}

		/**
		 * Constructor with arguments
		 * @param data
		 * @param var
		 */
		Node(T data,String var) {
			value = data;
			this.var = var;
			next = null;
		}
	}
	/**
	 * Default constructor
	 */
	public Queue() {
		last = first = null;
	}
	/**
	 * Method for enqueueing data
	 * @param data
	 */
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (last == null) {
			last = first = newNode;
			return;
		}
		last.next = newNode;
		last = newNode;
	}
	/**
	 * Generic method for dequeing
	 * @return
	 */
	public Node<T> dequeue() {
		if (first == null)
			return null;
		Node<T> temp=first;
		first = first.next;
		if (first == null)
			last = null;
		return temp;

	}
}

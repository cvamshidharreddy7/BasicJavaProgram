package com.jda.utility;

/**
 * @author 1022279
 * Ordered linked list class
 * @param <T>
 */
public class OrderedList<T extends Comparable<T>>  {
	public Node<T> first = null;

	public class Node<T> {
		public T value;
		public Node<T> next;

		Node(T data) {
			value = data;
			next = null;
		}
	}
	/**
	 * For adding in an ordered way
	 * @param data
	 */
	public void orderedAdd(T data) {
		Node<T> temp = first;
		Node<T> prev = null;

		while (temp != null && (data).compareTo(temp.value) <= 0) {
		prev = temp;
		temp = temp.next;
		}

		if (temp == first)
		add(data);
		else {
		if (temp == null) {
		Node<T> newnode = new Node<T>(data);
		prev.next = newnode;
		newnode.next = null;
		} 
		else {
		Node<T> newnode = new Node<T>(data);
		newnode.next = temp;
		prev.next = newnode;
		}
		}
		}
	/**
	 * For removing node which has value equal to the given data
	 * @param data
	 */
	public void removeAt(T data) {
		Node<T> temp = first;
		Node<T> prev = null;

		if (temp != null && ((temp.value).compareTo(data) == 0)) {
			first = temp.next;
			return;
		}
		while (temp != null && ((temp.value).compareTo(data) != 0)) {
			prev = temp;
			temp = temp.next;

		}
		if (temp == null)
			addAt(data);
		else
			prev.next = temp.next;

	}

	/**
	 * MEthod to check if the list is empty
	 * @return
	 */
	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	/**
	 * Method to get the size of the list
	 * @return
	 */
	public int size() {
		int count = 0;
		Node<T> temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	/**
	 * Method to get the head of the list's value
	 * @return
	 */
	public T peak() {
		return first.value;
	}
	
	/**
	 * Method for adding in a normal way
	 * @param data
	 */
	public void add(T data) {
		Node<T> newnode = new Node<T>(data);
		newnode.next = first;
		first = newnode;
	}

	/**
	 * Method for adding in a descending order
	 * @param data
	 */
	public void addAt(T data) {
		Node<T> newnode = new Node<T>(data);
		Node<T> temp = first;
		Node<T> prev = null;
		while (temp != null && ((temp.value).compareTo(data) >= 0)) {
			prev = temp;
			temp = temp.next;s

		}
		if (temp == null) {
			prev.next = newnode;
			newnode.next = null;
		} else {
			if (temp == first) {
				newnode.next = temp;
				first = newnode;
			} else {
				newnode.next = temp;
				prev.next = newnode;
			}
		}
	}

	/**
	 * Method for printing the list
	 */
	public void print() {
		Node<T> temp = first;
		while (temp != null) {
			System.out.print(temp.value + "  ");
			temp = temp.next;
		}
		System.out.println();
	}
}
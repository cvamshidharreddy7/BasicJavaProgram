package com.jda.utility;

import com.jda.utility.UnOrderedLinkedList;

/**
 * @author 1022279
 * Queue class for the bank problem
 * @param <T>
 */
public class QueueBank<T extends Comparable> {
	UnOrderedLinkedList<T> linkedList = new UnOrderedLinkedList<T>();
	private Node<T> first;
	private Node<T> last;
	private int size = 0;

	/**Node class
	 * @author 1022279
	 *
	 * @param <T>
	 */
	public class Node<T> {
		public int value;
		private T data;
		private Node<T> next;

		/**
		 * Node constructor
		 */
		public Node() {
			this.value = 0;
			this.data = null;
			this.next = null;
		}

		/**
		 * Node constructor with arguments
		 * @param obj
		 */
		public Node(T obj) {
			this.value = 0;
			this.data = obj;
			this.next = null;
		}

		/**
		 * Method for getting data
		 * @return
		 */
		public T getData() {
			return data;
		}

		/**
		 * Method for setting data in a node
		 * @param data
		 */
		public void setData(T data) {
			this.data = data;
		}

		/**
		 * Method for getting the next node of a given node
		 * @return
		 */
		public Node<T> getNext() {
			return next;
		}

		/**
		 * Method for setting the next node
		 * @param next
		 */
		public void setNext(Node<T> next) {
			this.next = next;
		}

	}

	/**
	 * Default constructor
	 */
	public QueueBank() {
		Node<T> var = new Node();
		this.first = var;
		this.last = this.first;
	}

	/**
	 * Method for enqueueing
	 * @param data
	 * @param value
	 * @param totalAmount
	 * @return
	 */
	public int enqueue(T data, int value, int totalAmount) {
		totalAmount = calculatetotalAmount(data, value, totalAmount);
		// System.out.println("Calculated total amount is" + totalAmount);

		if (totalAmount < 0) {
			System.out.println("No,You can't withdraw the amount.");
			System.out.println();
			totalAmount = totalAmount + (int) data;
		}
		Node<T> newData = new Node<T>(data);
		newData.data = data;
		newData.value = value;
		if (this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		} else {
			this.last.setNext(newData);
			this.last = newData;
		}
		size++;
		// System.out.println("The amount at present is:" + totalAmount);
		return totalAmount;
	}

	/**
	 * Method for dequeing
	 * @return
	 */
	public Node<T> dequeue() {
		Node<T> current = first;
		if (this.first.getData() == null) {
			// do nothing,already empty.
		} else {
			if (this.first.getNext() == null) {
				this.first.setData(null);
			} else {
				current = first.getNext();
				this.first = current;
			}
		}
		return current;
	}

	/**
	 * Method for calculatign the total amount
	 * @param data
	 * @param value
	 * @param calculatedtotalAmount
	 * @return
	 */
	public int calculatetotalAmount(T data, int value, int calculatedtotalAmount) {
		if (value == 1) {
			calculatedtotalAmount = calculatedtotalAmount + (int) data;

		}
		if (value == 2) {
			calculatedtotalAmount = calculatedtotalAmount - (int) data;
		}
		return calculatedtotalAmount;
	}

	/**
	 * Method for printing
	 */
	public void print() {
		boolean allPrinted = false;
		Node<T> crr = first;

		while (!allPrinted) {
			if (crr.getData() != null) {
				if (crr.getNext() != null) {
					System.out.print(crr.getData().toString() + ",");
					Node<T> crrNext = crr.getNext();
					crr = crrNext;
				} else {
					System.out.print(crr.getData().toString());
					allPrinted = true;
				}
			} else {
				allPrinted = true;
			}
		}
		System.out.println();
	}

}

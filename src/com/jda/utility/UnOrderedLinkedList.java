package com.jda.utility;

//import UnOrderedLinkedList.Node;

/**
 * Unordered linked list class
 * 
 * @author 1022279
 *
 * @param <T>
 */
public class UnOrderedLinkedList<T> {
	private Node<T> first;
	private Node<T> last;
	private int size;

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node() {
			this.data = null;
			this.next = null;
		}

		public Node(T obj) {
			this.data = obj;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
	
	/**
	 * Default constructor
	 */
	public UnOrderedLinkedList() {
		Node<T> var = new Node<T>();
		this.first = var;
		this.last = this.first;
	}

	/**
	 * Method for adding data to the list
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node<T> newData = new Node<T>(data);
		if (this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		} else {
			this.last.setNext(newData);
			this.last = newData;
		}
		size++;
	}

	
	/**
	 * Method for adding at the start of the list
	 * 
	 * @param data
	 */
	public void addFirst(T data) {
		Node<T> newData = new Node<T>(data);
		if (this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		} else {
			newData.setNext(first);
			first = newData;
		}
		size++;
	}
	public void addPos(T data,int pos) {
		Node<T> newData = new Node<T>(data);
		int count =1;
		if(this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		}
		
		
		else {
			pos--;
			Node<T> current = first;
			while(pos !=0) {
				current = current.getNext();
				pos--;
			}
			newData.setNext(current.getNext());
			current.setNext(newData);		
		}
		size++;
	}

	
	

	/**
	 * Method for removing the last node of the list
	 */
	public void removeLast() {
		Node<T> current = first;
		Node<T> temp = first;

		while (current != last) {
			temp = current;
			current = current.next;
		}
		last = temp;
		last.setNext(null);
		size--;
	}

	/**
	 * Method for removing the first node
	 */
	public void removeFirst() {
		Node<T> current = first;
		if (this.first.getData() == null) {
			// do nothing,already empty
		} else {
			if (this.first.getNext() == null) {
				this.first.setData(null);
			} else {
				current = first.getNext();
				this.first = current;
			}
		}
		size--;
	}

	/**
	 * Method for getting the first node's data
	 * 
	 * @return
	 */
	public T getNodeData(int i) { // Get data of node at position i
		Node<T> current = first;
		for(int m=0;m<i;m++) {
			current = current.getNext();
		}
		return current.getData();
	}
	public T firstValue() {
		Node<T> current = first;
		return current.getData();

	}

	/**
	 * Method for getting the last node's data
	 * 
	 * @return
	 */
	public T lastValue() {
		Node<T> current = first;
		// Node<T> currentNext = current.getNext();
		while (current.getNext() != null) {
			// currentNext = currentNext.getNext();
			current = current.getNext();
		}
		return current.getData();
	}
	/*
	 * public T getFirstData() { Node<T> current = first; return current.getData();
	 * } public T getLastData() { Node<T> currentBack = last; return
	 * currentBack.getData(); }
	 */

	/**
	 * MEthod to know if the list is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (first.getNext() == null)
			return true;
		else
			return false;
	}

	/**
	 * Method for removing node with the data same as the given data
	 * 
	 * @param data
	 */
	public void removePos(int pos) {
		Node<T> current = first;
		Node<T> prev = first;
		int var=0;
		while(var<pos && current != last) {
			prev = current;
			current = current.next;
			var++;
		}
		prev.setNext(current.next);
		
		size--;
	}
	public void remove(T data) {
		Node<T> current = first;
		if (this.first.getData().equals(data)) {
			if (this.first.getNext() == null) {
				Node<T> newNode = new Node<T>();
				this.first = newNode;
				this.last = this.first;
			} else {
				this.first.setData(null);
				this.first = this.first.getNext();
			}
			size--;
		} else {
			Node<T> currentNext = current.getNext();
			if (currentNext.getNext() != null) {
				if (currentNext.getData().equals(data)) {
					currentNext.setData(null);
					current.setNext(currentNext.getNext());
					currentNext = null;
					size--;
				} else {
					current = current.getNext();
				}
			}

		}
	}

	/**
	 * Method for printing the list
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

	/**
	 * Method for getting the size of the list
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

}
package com.jda.utility;

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

	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	public int size() {
		int count = 0;
		Node<T> temp = first;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	public T peak() {
		return first.value;
	}

	public void add(T data) {
		Node<T> newnode = new Node<T>(data);
		newnode.next = first;
		first = newnode;
	}

	public void addAt(T data) {
		Node<T> newnode = new Node<T>(data);
		Node<T> temp = first;
		Node<T> prev = null;
		while (temp != null && ((temp.value).compareTo(data) >= 0)) {
			prev = temp;
			temp = temp.next;

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

	public void print() {
		Node<T> temp = first;
		while (temp != null) {
			System.out.print(temp.value + "  ");
			temp = temp.next;
		}
		System.out.println();
	}
}
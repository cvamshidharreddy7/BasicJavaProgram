package com.jda.utility;

public class Queue<T extends Comparable<T>> {
	public Node<T> first = null;
	public Node<T> last = null;

	public static class Node<T> {
		public T value;
		public Node<T> next;
		public String var = null;

		Node(T data) {
			value = data;
			next = null;
		}

		Node(T data,String var) {
			value = data;
			this.var = var;
			next = null;
		}
	}
	public Queue() {
		last = first = null;
	}
	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (last == null) {
			last = first = newNode;
			return;
		}
		last.next = newNode;
		last = newNode;
	}
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

package com.jda.utility;

public class Deque<T extends Comparable> {
     //	Queue<T> q = new Queue<T>();
	UnOrderedLinkedList<T> q = new UnOrderedLinkedList<T>();
	public void addFront(T item) {
	q.addFirst(item);
	}
	public void addRear(T item) {
		q.add(item);
	}
	public void removeFront() {
		q.removeFirst();
	}
	public void removeRear() {
		q.removeLast();
	}
	public void isEmpty() {
		
	}
}

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
	public T removeFront() {
		T frontValue = q.firstValue();
		q.removeFirst();
		return frontValue;
	}
	public T removeRear() {
		T rearValue = q.lastValue();
		q.removeLast();
		return rearValue;
	}
	public boolean isEmpty() {
		if(q.getSize()==0) return true;
		else return false;
	}
	public int size() {
		return q.getSize();		
	}
	public void print() {
		q.print();
	}
	public T getFrontData() {
		return q.firstValue();
	}
	public T getLastData() {
		return q.lastValue();
	}
	
}

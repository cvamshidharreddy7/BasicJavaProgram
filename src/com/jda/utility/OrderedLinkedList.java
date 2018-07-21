package com.jda.utility;
public class OrderedLinkedList<T extends Comparable<T> > {
	private Node<T> first;
	private Node<T> last;
	private int size;
	
	private class Node<T>{
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
		public Node<T> getNext(){
			return next;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}		
	}
	public OrderedLinkedList() {
		Node<T> var = new Node<T>();
		this.first = var;
		this.last=this.first;
	}
	/*public void add(T data) {
		Node<T> newData = new Node<T>(data);
		if(this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		}
		else {
			this.last.setNext(newData);
			this.last = newData;
		}
		size++;
	}
*/
	
	public void add(T data) {
		Node<T> newData = new Node<T>(data);
		//Node<T> current = first;
		 //int z= (first.getData()).compareTo(newData.getData());
	/*	else {
			current = first;
			int x= current.getNext().data.compareTo(newData.getData());
			while(current.getNext() !=null && x<0) {
				current = current.getNext();
				}
			newData.next= current.getNext();
			current.next = newData;		
		} */
		 
		if(this.first==null) {
			newData.setNext(first);
			first = newData;
		}
		else {
			Node<T> current = first;
			Node<T> prev = null;
			while(current !=null && ((current.getData()).compareTo(newData.getData())<=0)) {
				prev = current;
				current = current.getNext();
			}
			
			
			if(current==null) {
				prev.setNext(newData);
				newData.setNext(null);
				
			}
			else {
				if(current==first) {
					newData.setNext(current);
					first = newData;
				}
				else {
					newData.setNext(current);
					prev.setNext(newData);
				}
				
			}
		}
		
	}
	
	public void remove(T data) {
		Node<T> current = first;
		if(this.first.getData().equals(data)) {
			if(this.first.getNext() == null) {
				Node<T> newNode = new Node<T>();
				this.first = newNode;
				this.last = this.first;
			} else {
				this.first.setData(null);
				this.first = this.first.getNext();
			}
			size--;
		}
		else {			
				Node<T> currentNext = current.getNext();
			if(currentNext.getNext()!=null) {
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
					System.out.print(crr.getData().toString() );
					allPrinted = true;
				}
			} else {
				allPrinted = true;
			}
		}
		System.out.println();
	}
	public int getSize() {
		return size;
	}
	
	
}

package com.jda.utility;
import com.jda.utility.UnOrderedLinkedList;




public class Queue<T extends Comparable> {
	UnOrderedLinkedList<T> linkedList = new UnOrderedLinkedList<T>();
	private Node<T> first;
	private Node<T> last;
	private int size =0;
	private class Node<T>{
		private int value;
		private T data;
		private Node<T> next;
		public Node() {
			this.value=0;
			this.data = null;
			this.next = null;			
		}
		public Node(T obj) {
			this.value=0;
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
	public Queue() { 
		Node<T> var = new Node();
		this.first = var;
		this.last = this.first;
	}
	
	public int enqueue(T data,int value,int totalAmount) {
		 totalAmount = calculatetotalAmount(data,value,totalAmount);
		//System.out.println("Calculated total amount is" + totalAmount);
		
		if(totalAmount<0) {
			System.out.println("No,You can't withdraw the amount.");
			System.out.println();
			totalAmount = totalAmount+(int)data;			
		}
		Node<T> newData = new Node<T>(data);
		newData.data=data;
		newData.value=value;
		if(this.first.getData() == null) {
			this.first = newData;
			this.last = this.first;
		}
		else {
			this.last.setNext(newData);
			this.last = newData;
		}
		size++;
	//	System.out.println("The amount at present is:" + totalAmount);
		return totalAmount;
	}
	public void dequeue() {
		Node<T> current = first;
		if(this.first.getData()==null) {
			//do nothing,already empty.
		}
		else {
			if(this.first.getNext()==null) {
				this.first.setData(null);
			}
			else {
				current = first.getNext();
				this.first=current;
			}
		}
	}

	public int calculatetotalAmount(T data,int value,int calculatedtotalAmount) {
		if(value ==1) {
			calculatedtotalAmount = calculatedtotalAmount+ (int)data;
			
		}
		if(value ==2) {
			calculatedtotalAmount = calculatedtotalAmount-(int)data;
		}
		return calculatedtotalAmount;
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
	
}

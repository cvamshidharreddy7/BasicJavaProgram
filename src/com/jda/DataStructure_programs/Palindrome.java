package com.jda.DataStructure_programs;

import com.jda.utility.Deque;
import com.jda.utility.Utility;

public class Palindrome {
	public static void main(String[] args) {
	Utility utility = new Utility();
	Deque<String> dq = new Deque<String>();
	System.out.println("Enter the string");
	String inputString = utility.getStringValue();
	for(int i=0;i<inputString.length();i++) {
		dq.addRear(String.valueOf(inputString.charAt(i)));
	}
	System.out.print("Deque initially is:");
	dq.print();
	int size = dq.size();
	int x=0;
	int y=size-1;
	System.out.println("size is: " + size);
	boolean flag=false;
	while(x<y) {		
	String firstValue = dq.removeFront();
	String lastValue = dq.removeRear();
	System.out.print("deque now is:");
	dq.print();
	System.out.println("first value:" +firstValue );
	System.out.println("lastValue:" +lastValue );
	
	 if(firstValue.compareTo(lastValue)!=0) {
		flag = true;
		break;
	}
	x++;
	y--;
	}
	System.out.println();
	if(flag == true) System.out.println("Not palindrome");
	else System.out.println("Palindrome!");
	}
}

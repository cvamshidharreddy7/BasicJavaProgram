package com.jda.utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Player{
	public String[] DeckOfCards;
	public Queue<String> queue = new Queue<String>(); 
	public Player(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			//arr[i]=arr[i].replaceAll("01", "Jack of ");
			arr[i]=arr[i].replaceAll("02", "2 of ");
			arr[i]=arr[i].replaceAll("03", "3 of ");
			arr[i]=arr[i].replaceAll("04", "4 of ");
			arr[i]=arr[i].replaceAll("05", "5 of ");
			arr[i]=arr[i].replaceAll("06", "6 of ");
			arr[i]=arr[i].replaceAll("07", "7 of ");
			arr[i]=arr[i].replaceAll("08", "8 of ");
			arr[i]=arr[i].replaceAll("09", "9 of ");
			arr[i]=arr[i].replaceAll("10", "10 of ");
			
			
		arr[i]=arr[i].replaceAll("11", "Jack of ");
		arr[i]=arr[i].replaceAll("12", "Queen of ");
		arr[i]=arr[i].replaceAll("13", "King of ");
		arr[i]=	arr[i].replaceAll("01", "Ace of ");
		queue.enqueue(arr[i]);		
		}
	}
	
	public void print() {
		for(int i=0;i<DeckOfCards.length;i++) {
			System.out.println(DeckOfCards[i]);
		}
	}
	ArrayList<String> arrLi = new ArrayList<String>();
	//HashMap<String, String> map = new HashMap<>();
	
	
	
	
}
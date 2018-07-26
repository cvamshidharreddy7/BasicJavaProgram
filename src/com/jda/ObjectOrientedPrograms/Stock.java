package com.jda.ObjectOrientedPrograms;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class Stock {
	public static Boolean compare(String str1,String str2) {
		 if(str1.compareTo(str2)==0) return true;
		 return false;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/Stock.json"));
		JSONObject jo = (JSONObject)obj; //Typecasting obj to JSON Object
		
		System.out.println("The details of stocks are");
		 System.out.println();
		 JSONArray stock = (JSONArray) jo.get("Stock");
		 Iterator<Map.Entry> iterator1 ;
		 Iterator iterator2 = stock.iterator();
		 int totalPrice =0;
		 
		 while (iterator2.hasNext()) 
	     {
	         iterator1 = ((Map) iterator2.next()).entrySet().iterator();
	         int noOfShares = 0;
	         int sharePrice=0;
	         int stockLocal;
	         while (iterator1.hasNext()) {
	             Map.Entry pair = iterator1.next();
	             
	             String key = (String) pair.getKey();
	             String value = (String) pair.getValue();
	            if(compare(key,"Share price")==true) {
	            	sharePrice = Integer.parseInt(value);
	            	// System.out.println("sharePrice is:" + sharePrice);
	             }
           if(compare(key,"Number of shares")==true) {
	            	 noOfShares = Integer.parseInt(value);
	            	 //System.out.println("noOfShares is:" + noOfShares);
	             }
	             
	             System.out.println(key + " : " + value);             
	         }
	         stockLocal = sharePrice*noOfShares;
	         System.out.println("stockLocal "+stockLocal);
	         System.out.println();
	         totalPrice = totalPrice+stockLocal;
	         
	     }
		 System.out.println("Total stock price is "+ +totalPrice + "$");
		 System.out.println();
		 
	}
}

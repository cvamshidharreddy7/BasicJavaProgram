package com.jda.ObjectOrientedPrograms;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
public class DataManagementJSON {
	public static Boolean compare(String str1,String str2) {
		 if(str1.compareTo(str2)==0) return true;
		 return false;
	 }
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
	Object obj = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/JSONProblem.json"));
	JSONObject jo = (JSONObject)obj; //Typecasting obj to JSON Object
	System.out.print("Type of the JSON file: ");
	
	String str = (String)jo.get("NAME");
	System.out.println(str);
	JSONArray Rice = (JSONArray) jo.get("Rice");
	System.out.println();
	@SuppressWarnings("unchecked")
	//Iterator iterator = Rice.iterator();
	 Iterator<Map.Entry> iterator1 ;
	 Iterator iterator2 = Rice.iterator();
	
	 int totalPrice =0;
	
	/*********Details of Rice*******************/
	System.out.println("The details of Rice are:");
	System.out.println();
	 while (iterator2.hasNext()) 
     {
         iterator1 = ((Map) iterator2.next()).entrySet().iterator();
       
         
         int priceLocal =0;
         int wt =0;//wt=p*wpk
         int p=0;
         int wpk=0;//weight per kg
         while (iterator1.hasNext()) {
             Map.Entry pair = iterator1.next();
             
             String key = (String) pair.getKey();
             String value = (String) pair.getValue();
             if(compare(key,"Price per kg")==true) {
            	p= Integer.parseInt(value);
             }
             if(compare(key,"Weight in kg")==true) {
            	 wpk = Integer.parseInt(value);
             }
             
             System.out.println(key + " : " + value);             
         }
         priceLocal = p*wpk;
         System.out.println("priceLocal "+priceLocal);
         System.out.println();
         totalPrice = totalPrice+priceLocal;
         
     }
	 System.out.println("TotalPrice of rice is "+ +totalPrice);
	 System.out.println();
	 System.out.println("---------------------------------------------------------");
	/*
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    
	 String pulseDetails = (String) jo.get("Name");
	 System.out.println(pulseDetails);
	JSONArray ja = (JSONArray) jo.get("Rice");
	
	*/
	/*********Details of pulses*******************/
	 System.out.println("The details of pulses are");
	 System.out.println();
	 JSONArray pulse = (JSONArray) jo.get("Pulses");
	 Iterator<Map.Entry> iteratorp1 ;
	 Iterator iteratorp2 = pulse.iterator();
	 int totalPricepulses=0;
	 while (iteratorp2.hasNext()) 
     {
		 iteratorp1 = ((Map) iteratorp2.next()).entrySet().iterator();
       
         
         int priceLocalpulses =0;
         int wt =0;//wt=p*wpk
         int p=0;
         int wpk=0;//weight per kg
         while (iteratorp1.hasNext()) {
             Map.Entry pair = iteratorp1.next();
             
             String key = (String) pair.getKey();
             String value = (String) pair.getValue();
             if(compare(key,"Price per kg")==true) {
            	p= Integer.parseInt(value);
             }
             if(compare(key,"Weight in kg")==true) {
            	 wpk = Integer.parseInt(value);
             }
             
             System.out.println(key + " : " + value);             
         }
         priceLocalpulses = p*wpk;
         System.out.println("priceLocalpulses "+priceLocalpulses);
         System.out.println();
         totalPricepulses = totalPricepulses+priceLocalpulses;
         
     }
	 System.out.println("Total price of pulses is "+ +totalPricepulses);
	 
	 System.out.println();
	 System.out.println("---------------------------------------------------------");
	 /*********Details of Wheat*******************/
	 System.out.println();
	 System.out.println("The details of Wheat are");
	 System.out.println();
	 JSONArray wheat = (JSONArray) jo.get("Wheat");
	 Iterator<Map.Entry> iteratorw1 ;
	 Iterator iteratorw2 = wheat.iterator();
	 int totalPriceWheat=0;
	 while (iteratorw2.hasNext()) 
     {
		 iteratorw1 = ((Map) iteratorw2.next()).entrySet().iterator();
       
         
         int priceLocalpulses =0;
         int wt =0;//wt=p*wpk
         int p=0;
         int wpk=0;//weight per kg
         while (iteratorw1.hasNext()) {
             Map.Entry pair = iteratorw1.next();
             
             String key = (String) pair.getKey();
             String value = (String) pair.getValue();
             if(compare(key,"Price per kg")==true) {
            	p= Integer.parseInt(value);
             }
             if(compare(key,"Weight in kg")==true) {
            	 wpk = Integer.parseInt(value);
             }
             
             System.out.println(key + " : " + value);             
         }
         priceLocalpulses = p*wpk;
         System.out.println("priceLocalpulses "+priceLocalpulses);
         System.out.println();
         totalPriceWheat = totalPriceWheat+priceLocalpulses;
         
     }
	 System.out.println("Total price of Wheat is "+ +totalPriceWheat);
	 
	 
	}
	
}

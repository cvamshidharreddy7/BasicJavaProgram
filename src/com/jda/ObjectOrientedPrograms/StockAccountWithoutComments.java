package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.impl.DefaultPrettyPrinter;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.DataStructure_programs.Calendar;
import com.jda.utility.Customer;
import com.jda.utility.Stock;
import com.jda.utility.UnOrderedLinkedList;
import com.jda.utility.Utility;


public class StockAccountWithoutComments {
	public static int amount;
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		Object obj = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/Output.json"));
		JSONObject jo = (JSONObject) obj;
		Object obj2 = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads//Stock Problem/Stock.json"));
		JSONObject jos = (JSONObject)obj2;
		
		String[] str = { "Jason", "Michael", "Lee" };
		Utility utility = new Utility();
		int value;
		Scanner scan = new Scanner(System.in);
		JSONArray customer = (JSONArray) jo.get("Customer");
		
		System.out.println("Enter the pro value,true-continue,false-stop");
		boolean pro;
		pro = utility.getBoolean();

		while (pro == true) {
			
		
			UnOrderedLinkedList<JSONObject> liste = new UnOrderedLinkedList<>();
			//This for loop helps in adding the persons' details to the linked list
			for(int i=0;i<customer.size();i++) {
			//	Customer person= new Customer((JSONObject) customer.get(i));
				JSONObject jo2 = (JSONObject) obj;
				jo2 = (JSONObject) customer.get(i);
				liste.add(jo2);
				
			} 
			
		
			liste.print();
			JSONObject jobj = new JSONObject();
		
			System.out.println("Enter the name of the customer you want to deal with:0-Jason,1-Michael,2-Lee,3-George,4-Alex");
			int m = utility.getN();
			JSONObject jo6 = (JSONObject) obj;
			jo6 = (JSONObject) customer.get(m);//JSONObect for getting a particular customer's data.For example Jason
			Customer cus2 = new Customer(jo6); //Customer object of a particular type. For example Jason.
			amount = Integer.parseInt(cus2.getMoney());//Networth of the customer
			System.out.println("His present networth is "+ amount);
			
			
		
			
			
			
			System.out.println("Enter which company's shares you want to buy:0-Apple,1-Facebook,2-Microsoft");
			int j = utility.getChange();
			
			System.out.println("Enter how many shares you want to buy");
			int n = utility.getN(); // Number of shares customer wants to buy
			JSONArray stock = (JSONArray) jos.get("Stock");
			JSONObject jo3 = (JSONObject)obj2;
			jo3 = (JSONObject) stock.get(j); //JSONObject for getting a particular company's data. For example, Apple.
			System.out.println(jo3);
			Stock stck = new Stock(jo3);
			
			
			int sharePrice = Integer.parseInt(stck.getSharePrice());
			int sharesAvailable = Integer.parseInt(stck.getNumberOfShares());
			String stockName = stck.getName();
			System.out.println("Current share price of the company is "+ sharePrice + " The number of sharess available are    "+ sharesAvailable);
		int[] array = new int[2];
		array = buy( amount, n, sharePrice, sharesAvailable);
			//After the above step, amount gets updated and sharesAvailable gets updated.
			//Now we want to edit the values of Money in customer file and Number of shares in Stocks file
		amount = array[0];
		sharesAvailable = array[1];
			 System.out.println("The amount he's left with is " + amount);
			cus2.setMoney(Integer.toString(amount));
			System.out.println("Customer details now are "+cus2);
			liste.print();
			liste.removePos(m);
			System.out.println("Liste after removing position m");
			liste.print();
			customer.remove(m);
			customer.set(m,cus2);
			System.out.println("Customer[m] is  "+ customer.get(m));
			JSONObject jo7 ;
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File("C:/Users/1022279/Downloads/gg.txt"),  customer.get(m));
			Object object = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/gg.txt"));
			JSONObject jo8 = (JSONObject) object;
			
			liste.addPos(jo8,m);
			liste.print();
			
			
			ArrayList<JSONObject> arrLi = new ArrayList<>();
			for(int i=0;i<liste.getSize();i++) {
				   arrLi.add(liste.getNodeData(i));
				
			   }
			   System.out.println("arrLi is" + arrLi);
			   jobj.put("Customer", arrLi);
			   //     System.out.println(check);
			   System.out.println(jobj);
				
				
				writer.writeValue(new File("C:/Users/1022279/Downloads/Output.json"), jobj);
			
				int amountSpent = array[2];
		//		Object obj = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/Output.json"));
		//		JSONObject jo = (JSONObject) obj;
		//      JSONArray customer = (JSONArray) jo.get("Customer");	
	         Object obj3 = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/Transaction.json"));
				JSONObject jot = (JSONObject)obj3;
				
				
				JSONArray transaction = (JSONArray) jot.get("Transaction");
				ArrayList<JSONObject> arrLiT = new ArrayList<>();
				
				Transaction transaction1 = new Transaction();
				transaction1.setCustomerName(cus2.getName());
				transaction1.setAmount(Integer.toString(amountSpent));
				transaction1.setStockName(stockName);
				transaction1.setNoOfStocks(Integer.toString(n));   
			        

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println(dtf.format(now)); //2016/11/16 12:08:43
			
				transaction1.setDate(dtf.format(now)); 
				System.out.println(transaction1.getCustomerName());
				System.out.println(transaction1.getStockName());
				System.out.println(transaction1.getNoOfStocks());
				System.out.println(transaction1.getAmount());
				
				System.out.println(transaction1.getDate());
			
				for(int i=0;i<transaction.size();i++) {
					JSONObject jo2 = (JSONObject) obj3;
					jo2 = (JSONObject) transaction.get(i);
					arrLiT.add(jo2);
				}
				
				
			//	ObjectMapper mapper = new ObjectMapper();
			//	ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
				writer.writeValue(new File("C:/Users/1022279/Downloads/gg2.txt"),  transaction1);
				Object objt = new JSONParser().parse(new FileReader("C:/Users/1022279/Downloads/gg2.txt"));
				JSONObject jo9 = (JSONObject) objt;
				
				
				System.out.println("The arrLiT data is :");
			for(int i=0;i<arrLiT.size();i++) {
				System.out.println(arrLiT.get(i));
			}
			int var = arrLiT.size();
			
			arrLiT.add(jo9);
			JSONObject jo10=new JSONObject();
			jo10.put("Transaction", arrLiT);
			writer.writeValue(new File("C:/Users/1022279/Downloads/Transaction.json"), jo10);
			System.out.println("Enter pro");
			pro = utility.getBoolean();
			
		}
	scan.close();
	}
	public static int[] buy(int amount,int n,int sharePrice,int sharesAvailable) {
		int[] array = new int[3];
		//n- Number of shares customer wants to buy
		//Variables which don't get updated-n,sharePrice
		//Variables which GET UPDATED-amount,sharesAvailable
		 int amountSpent = n*sharePrice;
		 if(amount>=amountSpent&&n<=sharesAvailable) {
			 System.out.println("Yes, the customer can buy those many number of stocks");
			 sharesAvailable = sharesAvailable-n;
			 amount = amount-amountSpent;
			 System.out.println("The amount he spent is " + amountSpent);
			 System.out.println("The amount he's left with is " + amount);
			 System.out.println("The number of stocks of the company now is "+ sharesAvailable);
		 }
		 else if(amount<amountSpent&&n<=sharesAvailable) {
			 System.out.println("Customer can't buy those many stocks!");
			 int stocksHeCanBuy = amount/n;
			 amountSpent = stocksHeCanBuy*sharePrice;
			 amount = amount-amountSpent;
			 sharesAvailable = sharesAvailable-stocksHeCanBuy;
			 System.out.println("The amount he spent is " + amountSpent);
			 System.out.println("The amount he's left with is " + amount);
			 System.out.println("The number of stocks of the company now is "+ sharesAvailable);
		 }
		 else if(amount>=amountSpent&&n>sharesAvailable) {
			 System.out.println("Customer can't buy those many stocks! There are only "+ sharesAvailable + " avaiable ");
			 int stocksHeCanBuy = sharesAvailable;
			 amountSpent = stocksHeCanBuy*sharePrice;
			 amount = amount-amountSpent;
			 sharesAvailable = sharesAvailable-stocksHeCanBuy;
			 System.out.println("The amount he spent is " + amountSpent);
			 System.out.println("The amount he's left with is " + amount);
			 System.out.println("The number of stocks of the company now is "+ sharesAvailable);
		 }
		 //Have to edit the Money variable in the customer file to amount
		 //Have to edit the Number of shares in the stock file
		 array[0] = amount;
		 array[1] = sharesAvailable;
		 array[2] = amountSpent;
		 return array;
		 
	}
	
}

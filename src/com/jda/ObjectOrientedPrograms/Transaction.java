package com.jda.ObjectOrientedPrograms;


	import java.util.Date;

	public class Transaction {
	String customerName;
	String stockName;
	String noOfStocks;
	String amount;
	String date;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getNoOfStocks() {
		return noOfStocks;
	}
	public void setNoOfStocks(String noOfStocks) {
		this.noOfStocks = noOfStocks;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString(){
		String x="\n{\n"+"\"Stock Name\" : \""+stockName+"\"\n" +"\"Customer Name\" : \""+customerName+"\"\n"+"\"Number of Stocks\" : \""+noOfStocks+"\"\n"+"\"Amount\" : \""+amount+"\"\n"+"\"date\" : \""+date+"\"\n"+"}\n";
		return x;
	}
	}


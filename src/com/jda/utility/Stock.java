package com.jda.utility;

import org.json.simple.JSONObject;

public class Stock {
	public String name;
	public String numberOfShares;
	public String sharePrice;

	public Stock(String name, String numberOfShares, String sharePrice) {
		this.name = name;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}

	public Stock(JSONObject jsonobject) {
		name = (String) jsonobject.get("Type");
		numberOfShares = (String) jsonobject.get("Number of shares");
		sharePrice = (String) jsonobject.get("Share price");
	}

	public String getName() {
		return this.name;
	}

	public String getNumberOfShares() {
		return this.numberOfShares;
	}

	public String getSharePrice() {
		return this.sharePrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfShares(String numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public void setMoney(String sharePrice) {
		this.sharePrice = sharePrice;
	}
	public String toString(){
		return "{" + "\"Name\":\"" + name + ",\"" + "\"Number\":\"" + numberOfShares + ",\"Money\":\"" + sharePrice + "}";
		}
}

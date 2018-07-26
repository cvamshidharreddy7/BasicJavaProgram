package com.jda.utility;

import org.json.simple.JSONObject;

public class Inventory {
	private String Type;
	private int Weight;
	private int Price;

	public Inventory(String Type, int Weight, int Price) {
		this.Type = Type;
		this.Weight = Weight;
		this.Price = Price;
	}
	public Inventory(JSONObject jsonobject) {
		Type = (String) jsonobject.get("name");
		Weight = (int) jsonobject.get("Weight in kg");
		Price = (int) jsonobject.get("Price per kg");
		
	}

	public String getType() {
		return Type;
	}

	public int getWeight() {
		return Weight;
	}

	public int getPrice() {
		return Price;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public void setWeight(int Weight) {
		this.Weight = Weight;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}
	@Override
	public String toString(){
	return "{" + "\"Type\":\"" + Type + ",\"" + "\"Weight\":\"" + Weight + ",\"Price\":\"" + Price + "}";
	}

}

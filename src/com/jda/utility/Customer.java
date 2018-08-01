package com.jda.utility;

import org.json.simple.JSONObject;

public class Customer {
	public String number;
	public String money;
	public String name;
	
	public Customer(String name,String number,String money) {
		this.name = name;
		this.number=number;
		this.money=money;
	}
	public Customer(JSONObject jsonobject) {
		name = (String) jsonobject.get("name");
		number = (String) jsonobject.get("number");
		money = (String) jsonobject.get("money");
	}
	public String getName() {
		return this.name;
	}
	public String getNumber() {
		return this.number;
	}
	public String getMoney() {
		return this.money;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	public String toString(){
		return "{" + "\"name\":\"" + name + ",\"" + "\"number\":\"" + number + ",\"money\":\"" + money + "}";
		}

}

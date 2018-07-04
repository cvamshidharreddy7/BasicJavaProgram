package com.jda.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility(){
		scanner =new Scanner(System.in);
	}
	public String inputName(){
		return scanner.next();
	}
			public  String replaceString(String x,String name){
					x = x.replaceAll("<<UserName>>",name);
					return x;
					
			}
		
}

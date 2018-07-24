package com.jda.ObjectOrientedPrograms;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	public static  String message = "Hello <<name>>, We have your full\r\n"
			+ "name as <<full name>> in our system. your contact number is 91xxxxxxxxxx.\r\n"
			+ "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	public static void main(String[] args) {	
	//Pattern replace = Pattern.compile("<<name>>");
	//Matcher matcher = replace.matcher(message);
	
	//message = matcher.replaceAll("Vamshi");
//	System.out.println(message);
	
	Scanner scanner = new Scanner(System.in);
	String name ;
	System.out.println("Enter the  name");
	name = scanner.nextLine();
	
	String fullName ;
	System.out.println("Enter the full name");
	fullName = scanner.nextLine();
	
	String mobileNumber ;
	System.out.println("Enter the mobileNumber");
	mobileNumber = scanner.nextLine();
	
	String date;
	System.out.println("Enter the date");
	date = scanner.nextLine();
	String[] arr = {"<<name>>","<<full name>>","91xxxxxxxxxx","01/01/2016"};
	HashMap<String, String> map = new HashMap<>(4);
	map.put(arr[0],name);
	map.put(arr[1],fullName);
	map.put(arr[2],mobileNumber);
	map.put(arr[3],date);
	
	
	for(int i=0;i<4;i++) {
		Pattern replace = Pattern.compile(arr[i]);
		Matcher matcher = replace.matcher(message);
		message = matcher.replaceAll(map.get(arr[i]));		
	}
	System.out.println();
	System.out.println(message);
	
	/*Pattern replace2 = Pattern.compile("<<full name>>");
	Matcher matcher2 = replace2.matcher(message);
	System.out.println(matcher2.replaceAll("Vamshidhar Reddy Cherukupalli"));
	*/
	}
}

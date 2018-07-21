package com.jda.DataStructure_programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.jda.utility.Utility;

public class NumberInASlot {
	public static void main(String[] args)  throws FileNotFoundException{
		Utility utility = new Utility();
		File file = new File("C:\\Users\\1022279\\Desktop\\NumberInASlot.txt");
		Scanner scanner = new Scanner(file);
		System.out.println("Enter the number you want to search for:");
		int n = utility.getN();
		
	}
}

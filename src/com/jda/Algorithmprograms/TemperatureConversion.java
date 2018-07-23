package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class TemperatureConversion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the temperature conversion type:1-Celsius to fahrenheit,2-Vice Versa");
		int value = utility.getNumber();
		System.out.println("Enter temperature");
		Double temperature = utility.getTemperature();
		System.out.println(utility.convertTemperature(temperature,value));
		
	}
}

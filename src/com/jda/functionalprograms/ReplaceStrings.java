/*************************************************
* Purpose :  





*************************************************/

package com.jda.functionalprograms;
import com.jda.utility.Utility;

public class ReplaceStrings {
				public static void main(String[] args){
					
							
							String template = "Hello <<UserName>>, How are you?";
							
							Utility utility = new Utility();
							String name=utility.inputName();
							template = utility.replaceString(template,name);
							System.out.println(template);		
							
				}
}

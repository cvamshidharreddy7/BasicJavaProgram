/*************************************************
* Purpose :  





*************************************************/

package com.jda.functionalprograms;
import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class ReplaceStrings {
				/**
				 * @param args
				 */
				public static void main(String[] args){
					
							
							String template = "Hello <<UserName>>, How are you?";
							
							Utility utility = new Utility();
							String name=utility.inputName();
							template = utility.replaceString(template,name);
							System.out.println(template);		
							
				}
}

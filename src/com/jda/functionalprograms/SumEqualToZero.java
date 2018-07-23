package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class SumEqualToZero {
		/**
		 * @param args
		 */
		public static void main(String[] args){
			Utility utility = new Utility();
			int[] Array = utility.getDataSum();
			utility.findingTriplets(Array);
			
		}

}

/**********************************
 * Pupose : To know the output of coin flipping
 * @author Vamshidhar Reddy
 * @version 1.0
 * @date 7/4/2018
 * 
 * 
 ************************************/

package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class PrintCoinFlippingOutput {
			/**
			 * @param args
			 */
			public static void main(String[] args){
				Utility utililty= new Utility();
				
					 int flips = utililty.numberOfFlips() ;
					int mNumberOfHeads = 0;
					int mNumberOfTails = 0;
					double mRandomNumber ;
					
					for(int i=0;i<flips;i++){
						mRandomNumber = utililty.randomNumberGenerator();
						if(mRandomNumber<0.5) mNumberOfTails++;
						else mNumberOfHeads++;
					}
					
					
					Double heads = Double.valueOf(mNumberOfHeads);
					Double tails = Double.valueOf(mNumberOfTails);
					System.out.println(heads + " vs " + tails);
					heads  = heads/flips;
					tails = tails/flips;
					heads = heads*100;
					tails = tails*100;
					
					System.out.println(heads + "% vs " + tails+"%");
					
					
			}
}

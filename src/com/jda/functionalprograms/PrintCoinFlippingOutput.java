package com.jda.functionalprograms;

import com.jda.utility.Utility2;

public class PrintCoinFlippingOutput {
			public static void main(String[] args){
				Utility2 utililty2 = new Utility2();
				
					 int flips = utililty2.numberOfFlips() ;
					int mNumberOfHeads = 0;
					int mNumberOfTails = 0;
					double mRandomNumber ;
					
					for(int i=0;i<flips;i++){
						mRandomNumber = utililty2.randomNumberGenerator();
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

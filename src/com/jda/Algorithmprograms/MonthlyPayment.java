package com.jda.Algorithmprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class MonthlyPayment {
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.println("ENter P,Y,R");
			Double P = utility.getP();
			Double Y = utility.getY();
			Double R = utility.getR();
			Double payment = utility.getPayment(P,Y,R);
			System.out.println(payment);
			
		}
}

package com.jda.functionalprograms;

import com.jda.utility.Utility;

/**
 * @author 1022279
 *
 */
public class Gambler {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utility utility = new Utility();
		int stake = utility.getStake();
		int goal = utility.getGoal();
		int numberOfTimes = utility.getNumber();
		utility.gamblingAlgo(stake, goal, numberOfTimes);
	}
}

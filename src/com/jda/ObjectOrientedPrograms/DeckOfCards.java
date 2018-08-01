package com.jda.ObjectOrientedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import com.jda.utility.Player;
import java.util.Queue;
import com.jda.utility.Utility;

public class DeckOfCards {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String[] suits = utility.suit();
		String[] rank = utility.rank();
		String[][] array = new String[4][13];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				array[i][j] = rank[j] + suits[i];
			}
		}
		String[] arr = new String[52]; // Array for storing all the cards.
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				list.add(array[i][j]);
			}
		}

		for (int i = 0; i < 52; i++) {
			arr[i] = list.get(i);
		}

		int randomNumber;
		String[][] players = new String[4][9];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				randomNumber = utility.randNum(0, 51);
				while (arr[randomNumber] == null) {
					randomNumber = utility.randNum(0, 51);
				}
				players[i][j] = arr[randomNumber];
				arr[randomNumber] = null;
			}
		}
		System.out.println("The cards players got are:");
		for (int i = 0; i < 4; i++) {
			System.out.print("player[" + i + "]---");
			for (int j = 0; j < 9; j++) {
				System.out.print(players[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
		System.out.println("The cards after each player is enqueued and each card got by a player are enqueued");
		System.out.println();
		/*
		 * String[] arrs = new String[9]; for (int j = 0; j < 9; j++) { arrs[j] =
		 * players[0][j];
		 * 
		 * } System.out.println(); Arrays.sort(arrs); for (int i = 0; i < arrs.length;
		 * i++) { //System.out.println(arrs[i]); } System.out.println(players[0]); //
		 * Player player = new Player(arrs);
		 */
		// Now sort each row of Players array
		for (int i = 0; i < 4; i++) {
			Arrays.sort(players[i]);
		}
		Queue<Player> q = new LinkedList<>(); //Used inbuilt queue for this operation
		for (int i = 0; i < 4; i++) {
			Player player = new Player(players[i]);
			System.out.print("Player["+i+"]"+"---");
			for (int j = 0; j < 9; j++) {
				System.out.print(player.queue.dequeue().value+",");
			}
			System.out.println();
		}

	}

}

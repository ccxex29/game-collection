package core;

import java.util.Scanner;

public class GamesMenu {
	private Scanner sc;
	void getGames() {
		System.out.println("Game Selections");
		System.out.println();
		/*
		 * Game Blueprint:
		 * Virtual Window for Game + Player Stats
		 * Cooked Terminal Command for non-TUI support
		 */
		System.out.println("1. Reversi");
		/* if (TUI Support) */
		// Show TUI Supported or not
		System.out.println("2. Caesar Cipher");
		System.out.println("3. Morse Code");
		System.out.println("4. FooBar");
		
		System.out.println("0. Exit Selection Menu");
		System.out.print(">>> ");
	}
	int selection() { // Selection on Register/Login
		int selectionvar = 999;//variable to store user input
		sc = new Scanner (System.in); // 
		do {
			getGames();
			try {
				selectionvar = sc.nextInt();
			}
			catch (Exception e) {
				selectionvar = 999;
			}
			sc.nextLine();
		} while(selectionvar > 4 || selectionvar < 0);
		return selectionvar;
	}
	void gamesMenu() {
		switch(selection()) {
			case 1: break;
			case 2: break;
		}
	}
}

/*
 * Object Oriented Programming Project LK01
 * Theme:
 * Game Collection
 * Team:
 * Louis Raymond (2201849535)
 * Christina Angelia (2201728004)
 * Lecturer : 
 * Livia Ashianti (D5358)
 */

package core;

import java.util.Scanner;
import core.Games.*;

public class GamesMenu{
	private Scanner sc;
	void getGames() {
		new RefreshPage();
		String gameselTitle = ("Game Selections" + " | " + "Welcome, " + "Anonymous"); // Greets User / Anonymous
		System.out.println(gameselTitle);
		for (int i = 0; i < gameselTitle.length(); i++) {
			System.out.print("=");
		}
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
		System.out.println("4. ------------");
		System.out.println("5. System Info");
		
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
		} while(selectionvar > 5 || selectionvar < 0);
		return selectionvar;
	}
	void gamesMenu() {
		int sel = 0;
		do {
			sel = selection();
			switch(sel) {
				case 1: new Reversi();
						break;
				case 2: new CaesarCipher();
						break;
				case 3: new Morse();
						break;
				case 4: 
						break;
				case 5: new SystemInfo();
						break;
			}
		}while(sel != 0);
	}
}

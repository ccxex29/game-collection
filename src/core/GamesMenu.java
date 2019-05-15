package core;

import java.util.Scanner;

public class GamesMenu {
	private Scanner sc;
	void getGames() {
		System.out.println("Game Selections");
		System.out.println();
		System.out.println("1. FooBar");
		System.out.println("2. FooBar");
		System.out.println("3. FooBar");
		
		System.out.println("0. Exit Selection Menu");
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
				sc.nextLine();
				selectionvar = 999;
			}
			sc.nextLine();
		} while(selectionvar > 3 && selectionvar < 0);
		return selectionvar;
	}
	void gamesMenu() {
		switch(selection()) {
			case 1: break;
			case 2: break;
		}
	}
}

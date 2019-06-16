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
import core.RefreshPage;

public class Main {
	public static final int availableThreads = Runtime.getRuntime().availableProcessors(); /*
																							* Checks Number of Processor Threads
																							* This will be imported in other package classes if needed
																							* One of the need is to ensure the multithreading efficiency
																							*/
	private Scanner sc; // Make new Scanner variable named "sc".
	public Main() { // Default constructor initiated from main function
		int mainSelector = 0; // Default Selector Value 
		sc = new Scanner(System.in); // assign sc variable to a new object of Scanner
		do {
			new MainMenu();
			try {								
				mainSelector = sc.nextInt();
			} catch (Exception e) {
				mainSelector = 0;
			}
			/*
			 * Minimalize Errors from improper input (Integer)
			 */
			sc.nextLine();
			handleSelection(mainSelector);
		}while(mainSelector != 3);
		sc.close(); // Close Scanner before program termination
		new RefreshPage();
		System.out.println("Game shutdown. Bye bye bye!");
	}

	public static void main(String[] args) {
		/* Initialize Vector User */
		
		/* Main Constructor call */
		new Main();
	}
	
	void handleSelection(int sel) { // Switch case function from Main()
		switch (sel) {
		case 1:
			(new RegLogin()).reglog(); // core.RegLogin.reglog() -> Opens the function from a class which is responsible to registration and login
			break;
		case 2:
			(new GamesMenu()).gamesMenu(); // core.GamesMenu.gamesMenu() -> Opens the function from a class which is responsible to games
			break;
		}
	}

}

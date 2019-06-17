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

package core.Games;
import static core.User.Users.userActive;

import java.util.Scanner;
import java.util.Vector;

import core.Games.ReversiComponents.*;
import core.User.UserCredentials;
import core.RefreshPage;

public class Reversi {
	int selReversiMode = -1;
	private Scanner sc;
	public Reversi(Vector<UserCredentials> UserStore) {
		sc = new Scanner(System.in);
		do {
			new RefreshPage();
			printCowSay();
			System.out.println();
			System.out.println("1. Normal Game");
			System.out.println("2. Custom Game");
			System.out.print(">>> ");
			try {
				selReversiMode = sc.nextInt();
				sc.nextLine();
			}
			catch (Exception e){
				selReversiMode = 0;
			}
		}while(selReversiMode < 0 && selReversiMode > 2);
		if (selReversiMode == 1) {
			new Main(1, UserStore);
			if (!UserStore.isEmpty()) {
				UserStore.get(userActive).setPoint(UserStore.get(userActive).getPoint()+1);
			}
			System.out.print("Game over!");			
		} 
		else if (selReversiMode == 2){
			new Main(2, UserStore);
			System.out.print("Game over!");	
		}
		
		sc.nextLine();
	}
	
	private void printCowSay() {
		String welcomebanner = "Welcome to reversi";
		System.out.print(" ");
		for (int i = 0; i < welcomebanner.length()+2; i++)
			System.out.print("_");
		System.out.println();
		System.out.println("< " + welcomebanner + " >");
		System.out.print(" ");
		for (int i = 0; i < welcomebanner.length()+2; i++) 
			System.out.print("-");
		System.out.println();
		System.out.println("         \\   ^__^");
		System.out.println("          \\  (oo)\\_______");
		System.out.println("             (__)\\       )\\/\\");
		System.out.println("                 ||----w |");
		System.out.println("                 ||     ||");
	}
}

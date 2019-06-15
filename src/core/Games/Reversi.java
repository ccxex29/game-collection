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
import java.util.Scanner;

import core.Games.ReversiComponents.*;

public class Reversi {
	private Scanner sc;
	public Reversi() {
		sc = new Scanner(System.in);
		new Main();
		sc.nextLine();
	}
}

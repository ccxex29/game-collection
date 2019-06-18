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

import static core.Main.*;


public class MainMenu {
	public MainMenu() {
		// TODO Auto-generated constructor stub
		new RefreshPage();
		GameVersion gv = new GameVersion();
		String gameMenuTitle = String.format("Game Collection Menu v%.2f | Available Threads: %d", gv.getVersion(), availableThreads);
		System.out.println(gameMenuTitle);
		for (int i = 0; i < gameMenuTitle.length(); i++) {
			System.out.print("=");
		}
		System.out.println();
		String gameMenuVendor = (gv.getAuthor1() + " (" + gv.getNim1() + ") -- " + gv.getAuthor2() + " (" + gv.getNim2() + ")");
		System.out.println(gameMenuVendor);
		for (int i = 0; i < gameMenuVendor.length(); i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1. Manage Users");
		System.out.println("2. Play Games");
		System.out.println("3. Exit");
		System.out.print(">>> ");
	}
}

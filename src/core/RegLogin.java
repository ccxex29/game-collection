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

public class RegLogin {
	private Scanner sc;
	void menuview() {
		new RefreshPage();
		System.out.println("Howdy!");
		System.out.println("1. Register");
		System.out.println("2. Login");
		System.out.println("0. Back");
		System.out.print(">>> ");
	}
	int selection() { // Selection on Register/Login
		int selectionvar = 999;//variable to store user input
		sc = new Scanner (System.in); // 
		do {
			menuview();
			try {
				selectionvar = sc.nextInt();
			}
			catch (Exception e) {
				selectionvar = 999;
			}
			sc.nextLine();
		} while(selectionvar > 3 && selectionvar < 0);
		return selectionvar;
	}
	
	void reglog() {
		switch(selection()) {
			case 1: break;
			case 2: break;
		}
	}
}

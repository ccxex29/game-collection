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

import core.RefreshPage;
import core.Games.MorseComponents.Decrypt;
import core.Games.MorseComponents.Encrypt;


public class Morse {
	private Scanner sc;
	public Morse(){
		sc = new Scanner(System.in);
		int selMorse = -1;
		do {
			new RefreshPage();
			ViewMenu();
			try {
				selMorse = sc.nextInt();				
			}
			catch  (Exception e) {
				selMorse = -1;
			}
		}while(selMorse < 0 || selMorse > 2);
		switch(selMorse) {
			case 1: new Encrypt();break;
			case 2: new Decrypt();break;
		}
	}
	public void ViewMenu()
	{
		System.out.println("Welcome to Morse Encryptor/Decryptor!");
		for (int i = 0; i < 36; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("1. Encrypt String");
		System.out.println("2. Decrypt Morse");
		System.out.println("0. Go Back");
		for (int i = 0; i < 36; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Morse Dictionary is limited (No Prosign/Non-English)");
		for (int i = 0; i < 36; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.print(">>> ");
	}
	
	
}

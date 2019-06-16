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

import core.Games.CaesarComponents.*;
import core.RefreshPage;

public class CaesarCipher{
	private Scanner sc;
	int sel = 0;
	public CaesarCipher() {
		do {
			switch (sel = selection()) {
				case 1:
					encryptMenu();
					break;
				case 2:
					decryptMenu();
					break;
				default:
					break;
			}
		}while(sel != 0);
	}
	
	private void encryptMenu() {
		int shifts = -1;
		sc = new Scanner(System.in);
		do {
			new RefreshPage();
			System.out.print("How many shifts? (Maximum 25) ");
			System.out.println();
			System.out.print(">>> ");
			try {
				shifts = sc.nextInt(); //prompts user for caesar cipher encryption shift
			} 
			catch (Exception e) {
				shifts = -1; // Use -1 as default value of shift
			}
			finally {
				sc.nextLine(); // since nextInt results in hasNextLine, nextLine needed to clear the buffer
			}
		} while (shifts == -1 || shifts > 25); // Ignore negative value and value more than 25, Let 0 quit the shift menu
		if (shifts != 0)
			new Encrypt(shifts); //Pass many shifts as parameter
	}
	
	private void decryptMenu() {
			new Decrypt();
	}
	
	private int selection() {
		int selection = -1;
		sc = new Scanner(System.in);
		do {
			caesarMenu();
			try {
				selection = sc.nextInt();
			} 
			catch (Exception e) {
				selection = -1;
			}
			finally {
				sc.nextLine();
			}
		} while (selection > 2 || selection < 0);
		return selection;
	}
	
	private void caesarMenu() {
		new RefreshPage();
		System.out.println("Caesar Cipher Encrypt/Decrypt Code");
		System.out.println("1. Encrypt");
		System.out.println("2. Decrypt");
		System.out.println("0. Back");
		System.out.print(">>> ");
	}
}

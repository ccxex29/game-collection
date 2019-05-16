package core.Games;

import java.util.Scanner;

import core.Games.CaesarComponents.*;

public class CaesarCipher {
	private Scanner sc;
	public CaesarCipher() {
		// TODO Auto-generated constructor stub
		sc.nextLine();
		switch (selection()) {
		case 1:
			encryptMenu();
			break;
		case 2:
			decryptMenu();
			break;
		default:
			break;
		}
	}
	
	private void encryptMenu() {
		int shifts = -1;
		sc = new Scanner(System.in);
		do {
			System.out.println("How many shifts? (Maximum 25)");
			try {
				shifts = sc.nextInt(); //prompts user for caesar cipher encryption shift
			} 
			catch (Exception e) {
				// TODO: handle exception
				shifts = -1; // Use -1 as default value of shift
			}
			finally {
				sc.nextLine(); // since nextInt results in hasNextLine, nextLine needed to clear the buffer
			}
		} while (shifts == -1 || shifts > 25); // Ignore negative value and value more than 25, Let 0 quit the shift menu
		if (shifts != 0)
			new Main(shifts); //Pass many shifts as parameter
	}
	
	private void decryptMenu() {
		
	}
	
	private int selection() {
		int selection = 999;
		sc = new Scanner(System.in);
		do {
			caesarMenu();
			try {
				selection = sc.nextInt();
			} 
			catch (Exception e) {
				// TODO: handle exception
				selection = 999;
			}
			finally {
				sc.nextLine();
			}
		} while (selection > 2 || selection < 0);
		return selection;
	}
	
	private void caesarMenu() {
		System.out.println("Caesar Cipher Encrypt/Decrypt Code");
		System.out.println("1. Encrypt");
		System.out.println("2. Decrypt");
		System.out.println("0. Back");
		System.out.print(">>> ");
		sc.nextLine();
	}
}

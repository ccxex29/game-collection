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

package core.Games.CaesarComponents;

import java.util.Scanner;

import core.RefreshPage;

public class Decrypt {
	private Scanner sc;
//	public Decrypt(Boolean decryptMode, String Cipher) {
	public Decrypt () {
		String sentence = "";
		String newSentence = "";
		int pos = 0;
		final String capitalAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
		final String numeric = "0123456789";
		sc = new Scanner(System.in);
		new RefreshPage();
		System.out.println("Enter your encrypted string. (0 to exit)");
		System.out.println();
		System.out.print(">>> ");
		sentence = sc.nextLine();
		if (!sentence.equals("0")) {
			for (int h = -26; h < 27; h++) {
				newSentence = "";
				System.out.printf("Key %-3d%c ", h, ':');
				for (int i = 0; i < sentence.length(); i++) {
					if (sentence.charAt(i) < 58 && sentence.charAt(i) > 47) { // Shifts numberic char
						pos = 0;
						while (sentence.charAt(i) != numeric.charAt(pos)) 
							pos++;
						pos+=h;
						while (pos > 9)
							pos-=10;
						while (pos < 0)
							pos+=10;
						newSentence = newSentence + numeric.charAt(pos);
					}
					else if (sentence.charAt(i) < 91 && sentence.charAt(i) > 64) { // Shifts capital alphabet char
						pos = 0;
						while (sentence.charAt(i) != capitalAlpha.charAt(pos)) 
							pos++;
						pos+=h;
						while (pos > 25)
							pos-=26;
						while (pos < 0)
							pos+=26;
						newSentence = newSentence + capitalAlpha.charAt(pos);
					}
					else if (sentence.charAt(i) < 123 && sentence.charAt(i) > 96) {
						pos = 0;
						while (sentence.charAt(i) != smallAlpha.charAt(pos)) 
							pos++;
						pos+=h;
						while (pos > 25)
							pos-=26;
						while (pos < 0)
							pos+=26;
						newSentence = newSentence + smallAlpha.charAt(pos);
					}
					else {
						newSentence = newSentence + sentence.charAt(i);
					}
				}
				System.out.println(newSentence);
			}
			sc.nextLine();
		}
	}
}

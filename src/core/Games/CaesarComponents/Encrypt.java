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

public class Encrypt {
	private Scanner sc;
	public Encrypt(int shift) {
		String sentence = "";
		String newSentence = "";
		int pos = 0;
		final String capitalAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String smallAlpha = "abcdefghijklmnopqrstuvwxyz";
		final String numeric = "0123456789";
		sc = new Scanner(System.in);
		System.out.println("Enter your encrypted string. (0 to exit)");
		System.out.println();
		System.out.print(">>> ");
		sentence = sc.nextLine();
		if (!sentence.equals("0")) {
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) < 58 && sentence.charAt(i) > 47) { // Shifts numberic char
					pos = 0;
					while (sentence.charAt(i) != numeric.charAt(pos)) 
						pos++;
					pos+=shift;
					while (pos > 9)
						pos-=10;
					newSentence = newSentence + numeric.charAt(pos);
				}
				else if (sentence.charAt(i) < 91 && sentence.charAt(i) > 64) { // Shifts capital alphabet char
					pos = 0;
					while (sentence.charAt(i) != capitalAlpha.charAt(pos)) 
						pos++;
					pos+=shift;
					while (pos > 25)
						pos-=26;
					newSentence = newSentence + capitalAlpha.charAt(pos);
				}
				else if (sentence.charAt(i) < 123 && sentence.charAt(i) > 96) {
					pos = 0;
					while (sentence.charAt(i) != smallAlpha.charAt(pos)) 
						pos++;
					pos+=shift;
					while (pos > 25)
						pos-=26;
					newSentence = newSentence + smallAlpha.charAt(pos);
				}
				else {
					newSentence = newSentence + sentence.charAt(i);
				}
			}
			System.out.println();
			System.out.print("Result : " + newSentence);
			sc.nextLine();
		}
	}
}

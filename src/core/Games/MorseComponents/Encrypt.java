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

package core.Games.MorseComponents;

import java.util.Scanner;

import core.RefreshPage;

public class Encrypt {
	
	private Scanner sc;

	public Encrypt() {
		String kata = "";
		sc = new Scanner(System.in);
		do {
			new RefreshPage();
			System.out.print("Enter Your String: ");
			kata = "";
			kata = sc.nextLine();
		} while (kata.isEmpty());
		
		if (!kata.equals("0")) {
			convert(kata);
			sc.nextLine();
		}
	}
	
	private void convert(String kata) {
//		String read = "";
		for (int i = 0; i < kata.length(); i++) {
			switch (kata.toLowerCase().charAt(i)) {
				case ' ': System.out.println();
				break;
				case 'a': System.out.print(".-");
				break;
				case 'b': System.out.print("-...");
				break;
				case 'c': System.out.print("-.-.");
				break;
				case 'd': System.out.print("-..");
				break;
				case 'e': System.out.print(".");
				break;
				case 'f': System.out.print("..-.");
				break;
				case 'g': System.out.print("--.");
				break;
				case 'h': System.out.print("....");
				break;
				case 'i': System.out.print("..");
				break;
				case 'j': System.out.print(".---");
				break;
				case 'k': System.out.print("-.-");
				break;
				case 'l': System.out.print(".-..");
				break;
				case 'm': System.out.print("--");
				break;
				case 'n': System.out.print("-.");
				break;
				case 'o': System.out.print("---");
				break;
				case 'p': System.out.print(".--.");
				break;
				case 'q': System.out.print("--.-");
				break;
				case 'r': System.out.print(".-.");
				break;
				case 's': System.out.print("...");
				break;
				case 't': System.out.print("-");
				break;
				case 'u': System.out.print("..-");
				break;
				case 'v': System.out.print("...-");
				break;
				case 'w': System.out.print(".--");
				break;
				case 'x': System.out.print("-..-");
				break;
				case 'y': System.out.print("-.--");
				break;
				case 'z': System.out.print("--..");
				break;
				case '0': System.out.print("-----");
				break;
				case '1': System.out.print(".----");
				break;
				case '2': System.out.print("..---");
				break;
				case '3': System.out.print("...--");
				break;
				case '4': System.out.print("....-");
				break;
				case '5': System.out.print(".....");
				break;
				case '6': System.out.print("-....");
				break;
				case '7': System.out.print("--...");
				break;
				case '8': System.out.print("---..");
				break;
				case '9': System.out.print("----.");
				break;
				case '.': System.out.print(".-.-.-");
				break;
				case ',': System.out.print("--..--");
				break;
				case '?': System.out.print("..--..");
				break;
				case '!': System.out.print("-.-.--");
				break;
				case '`': System.out.print(".----.");
				break;
				case '/': System.out.print("-..-.");
				break;
				case ':': System.out.print("---...");
				break;
				case ';': System.out.print("-.-.-.");
				break;
				case '=': System.out.print("-...-");
				break;
				case '+': System.out.print(".-.-.");
				break;
				case '-': System.out.print("-....-");
				break;
				case '_': System.out.print("..--.-");
				break;
				case '\"': System.out.print(".-..-.");
				break;
				case '$': System.out.print("...-..-");
				break;
				case '@': System.out.print(".--.-.");
				break;
				case '(': 
				case '[':
				case '{':
						System.out.print("-.--.");
				break;
				case ')':
				case ']':
				case '}':
						System.out.print("-.--.-");
				case '&': 
						System.out.print(".-...");
				break;
				default:
					break;
			}
			if (kata.charAt(i) != ' ')
				System.out.print(" ");
		}
		
	}
}

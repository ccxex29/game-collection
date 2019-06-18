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

public class Decrypt {

	private Scanner sc;
	
	public Decrypt() {
		String kata = "";
		sc = new Scanner(System.in);
		do {
			kata = "";
			new RefreshPage();
			System.out.println("Enter Your Morse Code.");
			System.out.println("Separate each letter with a space");
			System.out.println("Separate each word with double space");
			System.out.println();
			System.out.println();
			System.out.print(">>> ");
			kata = sc.nextLine();
		} while (kata.isEmpty());
		
		if (!kata.equals("0")) {
			convert(kata);
			sc.nextLine();
		}
	}
	
	private void convert(String kata) {
		String read = "";
		Boolean invalidStatus = false;
		for (int i = 0; i < kata.length(); i++) {
			read = read + kata.charAt(i);
			
			if(i+1 < kata.length()) {
				if (kata.charAt(i+1) == ' ') {
					switch (read) {
						case ".-" : System.out.print("a");	
									break;
						case "-..." : System.out.print("b");	
						break;
						case "-.-." : System.out.print("c");	
						break;
						case "-.." : System.out.print("d");	
						break;
						case "." : System.out.print("e");	
						break;
						case "..-." : System.out.print("f");	
						break;
						case "--." : System.out.print("g");	
						break;
						case "...." : System.out.print("h");	
						break;
						case ".." : System.out.print("i");	
						break;
						case ".---" : System.out.print("j");	
						break;
						case "-.-" : System.out.print("k");	
						break;
						case ".-.." : System.out.print("l");	
						break;
						case "--" : System.out.print("m");	
						break;
						case "-." : System.out.print("n");	
						break;
						case "---" : System.out.print("o");	
						break;
						case ".--." : System.out.print("p");	
						break;
						case "--.-" : System.out.print("q");	
						break;
						case ".-." : System.out.print("r");	
						break;
						case "..." : System.out.print("s");	
						break;
						case "-" : System.out.print("t");	
						break;
						case "..-" : System.out.print("u");	
						break;
						case "...-" : System.out.print("v");	
						break;
						case ".--" : System.out.print("w");	
						break;
						case "-..-" : System.out.print("x");	
						break;
						case "-.--" : System.out.print("y");	
						break;
						case "--.." : System.out.print("z");	
						break;
						case "-----" : System.out.print("0");	
						break;
						case ".----" : System.out.print("1");	
						break;
						case "..---" : System.out.print("2");	
						break;
						case "...--" : System.out.print("3");	
						break;
						case "....-" : System.out.print("4");	
						break;
						case "....." : System.out.print("5");	
						break;
						case "-...." : System.out.print("6");	
						break;
						case "--..." : System.out.print("7");	
						break;
						case "---.." : System.out.print("8");	
						break;
						case "----." : System.out.print("9");	
						break;
						case ".-.-.-" : System.out.print(".");	
						break;
						case "--..--" : System.out.print(",");	
						break;
						case "..--.." : System.out.print("?");	
						break;
						case "-.-.--" : System.out.print("!");	
						break;
						case ".----." : System.out.print("`");	
						break;
						case "-..-." : System.out.print("/");	
						break;
						case "-.--." : System.out.print("(");	
						break;
						case "-.--.-" : System.out.print(")");	
						break;
						case ".-..." : System.out.print("&");	
						break;
						case "---..." : System.out.print(":");	
						break;
						case "-.-.-." : System.out.print(";");	
						break;
						case "-...-" : System.out.print("=");	
						break;
						case ".-.-." : System.out.print("+");	
						break;
						case "-....-" : System.out.print("-");	
						break;
						case "..--.-" : System.out.print("_");	
						break;
						case "...-..-" : System.out.print("$");	
						break;
						case ".--.-." : System.out.print("@");	
						break;
						default:
							invalidStatus = true;
					}
					if (i+2 < kata.length())
						i++;
					read = "";
					if ((i+1) < kata.length()) {
						if (kata.charAt(i+1) == ' ') {
							i++;
							System.out.print(" ");
						}
					}
				}
			}
			if (invalidStatus) {
				break;
			}
		}
		
	}
	
}

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

import core.Games.MorseComponents.Main;

public class Morse {
	private Scanner sc;
	private String kata;
	public Morse(){
		sc = new Scanner(System.in);
		sc.nextLine();
		ViewMenu();
	}
	public void ViewMenu()
	{
		System.out.println("Morse encrypt");
		do
		{
			System.out.println("Insert String[1-100 word(s)]: ");
			kata = sc.nextLine();
		}
		while(kata.length()<1||kata.length()>100);
		new Main(kata);
		
		
	}
	
	
}

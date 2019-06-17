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
import core.User.RegistDetails;

public class Morse {
	private Scanner sc;
	int choose=-1;
	public String Username="";
	public String UserEmail="";
	RegistDetails user = new RegistDetails(UserEmail, UserEmail);
	public void viewuser()
	{
		System.out.println("User: "+user.getUsername());
	}
	public Morse(){
		System.out.println("Morse");
		sc = new Scanner(System.in);
		viewuser();
		ViewMenu();
	}
	public void ViewMenu()
	{
		do
		{
			do {
			System.out.println("Morse Menu");
		System.out.println("1. Encrypted");
		System.out.println("2. Decrypted");
		System.out.println("0. Back");
		System.out.println(">>: ");
		choose=sc.nextInt();
//		sc.nextLine();
		new Main(choose);
		} while(choose<0||choose>2);
		}while (choose!=0);
		

		
		
		
	}
	
	
}

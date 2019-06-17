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

package core.User;

import java.util.Scanner;
import java.util.Vector;

import core.RefreshPage;

import static core.User.Users.userActive;;

public class LoginUser {
	private Scanner sc;
	public LoginUser(Vector<UserCredentials> UserStore) {
		int chooseLogin = -1;
		sc = new Scanner(System.in);
		if (!UserStore.isEmpty()) {
			do {
				try {
					new RefreshPage();
					viewUsers(UserStore);
					System.out.println("Select Index Number");
					System.out.println();
					System.out.print(">>> ");
					chooseLogin = sc.nextInt();
					sc.nextLine();
					if (chooseLogin == 0) {
						break;
					}
					if (chooseLogin > -1 && chooseLogin <= UserStore.size()) {
						if (userActive == chooseLogin-1)
							System.out.println("You're already an active user but okay.");
						else
							System.out.println("Welcome, " + UserStore.get(chooseLogin-1).getName());
						userActive = chooseLogin-1;
						sc.nextLine();
					}
				}
				catch (Exception e) {
					chooseLogin = -1;
				}
			}while (chooseLogin == -1);
		}
		else {
			System.out.println("No User Found!");
			sc.nextLine();
		}
	}
	private void viewUsers(Vector<UserCredentials> UserStore) {
		for (int i = 0; i < 51; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.printf("%-3s. %-22s %-8s %s","No.", "User Name", "Points", "State");
		System.out.println();
		for (int i = 0; i < 51; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 0; i < UserStore.size(); i++) {
			System.out.printf("%-3d. %-22s %-8d ",i+1, UserStore.get(i).getName(), UserStore.get(i).getPoint());
			if (i == userActive)
				System.out.print("Active User");
			System.out.println();
		}
		for (int i = 0; i < 51; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}

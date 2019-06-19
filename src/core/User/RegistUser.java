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

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.RefreshPage;
import static core.User.Users.userActive;

import java.util.Scanner;

public class RegistUser {
	private String UserName;
	
	private Scanner sc;
	public RegistUser(Vector<UserCredentials> UserStore) {
		sc = new Scanner(System.in);
		do {
			new RefreshPage();
			System.out.print("Enter Username (5-20 chars): ");
			UserName = sc.nextLine();
		}while(validCheck(UserName, UserStore));
		if (!UserName.equals("0")) {
			UserStore.add(new UserCredentials(UserName));
			
			new RefreshPage();
			userActive = UserStore.size()-1;
			System.out.println("Welcome to the Game, " + UserStore.get(UserStore.size()-1).getName() + "!");
			sc.nextLine();
			
		}
	}
	private Boolean validCheck(String userName, Vector<UserCredentials> UserStore) {
		Pattern patternStr = Pattern.compile("[a-zA-Z0-9]");
		Matcher matchStr = patternStr.matcher(userName);
		if (userName.equals("0"))
			return false;
		else if (!matchStr.find()) {
			return true;
		}
		else if (userName.contains(" "))
			return true;
		else if (userName.length() < 5 || userName.length() > 20 ) {
			return true;
		}
		else if (!UserStore.isEmpty()) {
			for (int i = 0; i < UserStore.size(); i++) {
				if (UserStore.get(i).getName().equals(userName)) {
					return true;
				}
			}
		}
			
		return false;
		
	}
}

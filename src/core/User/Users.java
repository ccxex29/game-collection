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

public class Users {
	public Vector<UserCredentials> UserStore = new Vector<>();
	public static Integer userActive = -1;
	public void RegistUser() {
		new RegistUser(UserStore);
	}
	public void LoginUser() {
		new LoginUser(UserStore);
	}
}

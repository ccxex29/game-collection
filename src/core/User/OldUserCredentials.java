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

public abstract class OldUserCredentials {
	
//	String RegID = ""; 
					/*
					 * Registration ID based on RegIDTemp calculation. 64 Arrays with LinkedList and Randomized Numbers.
					 * Example: 53000177
					 *          ^ ^   ^
					 *          | |   |_______Randomized number (2 digits, 00~99)
					 *          | |___________LinkedList Index (4 digits, Starting from 1)
					 *          |_____________Array Index (2 digits, Starting from 1)
					 */
	String Name = ""; // --> Username can be anything supported by the program
	public OldUserCredentials() {
		
	}
	public OldUserCredentials(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}

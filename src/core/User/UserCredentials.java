package core.User;

public class UserCredentials {
	Integer RegIDTemp = 0; // --> Registration ID will use hashing technique. The Registration ID will consists of 8 maximum digits
	String RegID = ""; 
					/*
					 * Registration ID based on RegIDTemp calculation. 64 Arrays with LinkedList and Randomized Numbers.
					 * Example: 53000177
					 *          ^ ^   ^
					 *          | |   |_______Randomized number (2 digits, 00~99)
					 *          | |___________LinkedList Index (4 digits, Starting from 1)
					 *          |_____________Array Index (2 digits, Starting from 1)
					 */
	String Name = ""; // --> Username can be anything supported by the program
	
	public UserCredentials() {
		
	}
	
	
}

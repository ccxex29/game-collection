package core.User;

import java.util.Vector;

public class RegistDetails {
	private Vector<UserCredentials> RegDetails = new Vector <UserCredentials>();
	
	public RegistDetails() {
		// TODO Auto-generated constructor stub
	}
	
	int getSize() {
		return RegDetails.size();
	}
	
	void addUser(String uID, String uName, String uEmail) {
		RegDetails.add(new UserCredentials(uID, uName, uEmail));
	}
}

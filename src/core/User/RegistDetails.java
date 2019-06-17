package core.User;



public class RegistDetails {
	public String username;
	public String useremail;
	public RegistDetails(String username, String useremail) {
		super();
		this.username = username;
		this.useremail = useremail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	

}

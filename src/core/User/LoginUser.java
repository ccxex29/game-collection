package core.User;

import java.util.Scanner;
import java.util.Vector;

public class LoginUser {

	public String Username;
	public String useremail;
	int choose;
	public String Usernameregist;
	public String useremailregist;
	Scanner scan = new Scanner(System.in);
	RegistDetails user = new RegistDetails(Usernameregist, useremailregist);
	Vector<RegistDetails> us = new Vector<>();
	public LoginUser() {
		for(int i=0;i<us.size();i++)
		{
			System.out.println("User #"+(i+1));
			System.out.println("Username: "+us.get(i).getUsername());
			System.out.println("Email: "+us.get(i).getUseremail());
		}
		
		do
		{
		System.out.println("Choose Your Account: ");
		choose=scan.nextInt();
		}while(choose<1||choose>us.size());
		
	
	}
}

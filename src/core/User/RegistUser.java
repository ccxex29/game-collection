package core.User;

import java.util.Vector;
import java.util.Scanner;

public class RegistUser {
//	private UserCredentials[] UserStore = new UserCredentials[64];
	@SuppressWarnings("unchecked")
	private Vector<RegistDetails> UserStore = new Vector<RegistDetails>(64);
	private String UserName;
	private String UserEmail;
	Integer RegIDTemp = 0; // --> Registration ID will use hashing technique. The Registration ID will consists of 8 maximum digits
	private String UserID;
	private int hashing;
	private Scanner sc;
	public RegistUser() {
		hashing = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		UserName = sc.nextLine();
		System.out.println("Enter Email: ");
		UserEmail = sc.nextLine();
		for (int i = 0; i < UserName.length(); i++) {
			hashing += (int)UserName.charAt(i);
		}
		hashing %= 64;
		RegIDTemp = (int) (Math.random()*64) + 1;
		System.out.println(UserStore.get(hashing).getSize());
		if (hashing < 10)
			UserID = "0" + hashing;
		if (UserStore.indexOf(UserStore, hashing) < 9)
			UserID = UserID + "000" + UserStore.get(hashing).getSize();
		else if (UserStore.get(hashing).getSize() < 99)
			UserID = UserID + "00" + UserStore.get(hashing).getSize();
		else if (UserStore.get(hashing).getSize() < 999)
			UserID = UserID + "0" + UserStore.get(hashing).getSize();
		else
			UserID = UserID + UserStore.get(hashing).getSize();
		UserID = UserID + RegIDTemp;
		System.out.println(UserID);
		sc.nextLine();
		UserStore.get(hashing).addUser(UserID, UserName, UserEmail);
		sc.nextLine();
	}
	public void VectorInit () {
		for (int i = 0; i < 64; i++) {
			UserStore.add(null);
		}
	}
}
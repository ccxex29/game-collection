package core;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		int mainSelector = 0;
		Scanner sc = new Scanner(System.in);
		do {
			new MainMenu();
			try {
				mainSelector = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				mainSelector = 0;
			}
			sc.nextLine();
		}while(mainSelector != 3);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

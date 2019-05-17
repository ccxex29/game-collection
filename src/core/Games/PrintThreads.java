package core.Games;

import static core.Main.*;

import java.util.Scanner;

public class PrintThreads {
	private Scanner sc;
	public PrintThreads() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		System.out.println(availableThreads);
		sc.nextLine();
	}
}

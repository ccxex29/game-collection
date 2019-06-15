package core.Games;

import static core.Main.*;

import java.util.Scanner;

public class SystemInfo {
	private Scanner sc;
	public SystemInfo() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		System.out.println("Threads: " + availableThreads);
//		if (Runtime.getRuntime().maxMemory() == Long.MAX_VALUE) 
//			System.out.println("No Limit");
//		else
//			System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println("Available Memory: " + Runtime.getRuntime().totalMemory()/1048576 + " MiB");
		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory()/1048576 + " MiB");
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory()/1048576 + "MiB");
		
		sc.nextLine();
	}
}

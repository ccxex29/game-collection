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

package core.Games;

import static core.Main.*;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import core.RefreshPage;


public class SystemInfo {
	private Scanner sc;
	public SystemInfo() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
//		if (Runtime.getRuntime().maxMemory() == Long.MAX_VALUE) 
//			System.out.println("No Limit");
//		else
//			System.out.println(Runtime.getRuntime().maxMemory());
		
		new RefreshPage();
		
		try {
			System.out.println("Hostname : " + InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("OS : " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch"));
		System.out.println("Java : " + System.getProperty("java.vendor") + " "+ System.getProperty("java.version"));
		System.out.println("Threads: " + availableThreads);
		System.out.println("Max Memory: " + ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getMax()/1048576 + "MiB");
		System.out.println("Min Memory: " + ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getInit()/1048576 + "MiB");
//		System.out.println("Available Memory: " + Runtime.getRuntime().totalMemory()/1048576 + " MiB");
//		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory()/1048576 + " MiB");
//		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory()/1048576 + "MiB");
		
		sc.nextLine();
	}
}

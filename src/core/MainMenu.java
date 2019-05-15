package core;

public class MainMenu {
	
	public MainMenu() {
		// TODO Auto-generated constructor stub
		System.out.println("Game Collection Menu v" + (new GameVersion()).getVersion());
		
		System.out.println("Louis Raymond (2201849535) -- Hello World (FooBar)");
		System.out.println("1. Register/Login");
		System.out.println("2. Play Games");
		System.out.println("3. Exit");
		System.out.print(">>> ");
	}
}

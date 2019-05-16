package core;

public class MainMenu {
	
	public MainMenu() {
		// TODO Auto-generated constructor stub
		new RefreshPage();
		GameVersion gv = new GameVersion();
		System.out.println("Game Collection Menu v" + gv.getVersion());
		
		System.out.println(gv.getAuthor1() + " (" + gv.getNim1() + ") -- " + gv.getAuthor2() + " (" + gv.getNim2() + ")");
		System.out.println("1. Register/Login");
		System.out.println("2. Play Games");
		System.out.println("3. Exit");
		System.out.print(">>> ");
	}
}

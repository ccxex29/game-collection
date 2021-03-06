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

package core.Games.ReversiComponents;

import java.util.Scanner;
import java.util.Vector;

import core.RefreshPage;
import core.User.UserCredentials;
import static core.User.Users.userActive;

public class Main implements Board{
	private Scanner sc;
	private String inputReversi = "";
	private int whiteMoves = 0;
	private int blackMoves = 0;
	private char whiteDisk = 'W';
	private char blackDisk = 'B';
	private char emptyDisk = '█';
	
	int gameOverPoints = 0;
	int whitePoints = 0;
	int blackPoints = 0;
	private Boolean turn = false; // false = black; true = white
	/*
	 * Starting Board to be used for new game.
	 */
	private final Integer [][] StartGame = {
			// None  = 0
			// Black = 1
			// White = 2
		//   A B C D E F G H
			{0,0,0,0,0,0,0,0}, // 1
			{0,0,0,0,0,0,0,0}, // 2
			{0,0,0,0,0,0,0,0}, // 3
			{0,0,0,1,2,0,0,0}, // 4
			{0,0,0,2,1,0,0,0}, // 5
			{0,0,0,0,0,0,0,0}, // 6
			{0,0,0,0,0,0,0,0}, // 7
			{0,0,0,0,0,0,0,0}, // 8
	};
	
	private Integer [][] CustomGame = {
			// None  = 0
			// Black = 1
			// White = 2
			// Undetermined = 9
		//   A B C D E F G H
			{9,9,9,9,9,9,9,9}, // 1
			{9,9,9,9,9,9,9,9}, // 2
			{9,9,9,9,9,9,9,9}, // 3
			{9,9,9,9,9,9,9,9}, // 4
			{9,9,9,9,9,9,9,9}, // 5
			{9,9,9,9,9,9,9,9}, // 6
			{9,9,9,9,9,9,9,9}, // 7
			{9,9,9,9,9,9,9,9}, // 8
	};
	
	private Integer [][] boardGame = {
			// Empty      = 0
			// Black      = 1
			// White      = 2
			// BlackTemp  = 3
			// WhiteTemp  = 4
			// mayChange  = 5
		//   A B C D E F G H
			{0,0,0,0,0,0,0,0}, // 1
			{0,0,0,0,0,0,0,0}, // 2
			{0,0,0,0,0,0,0,0}, // 3
			{0,0,0,0,0,0,0,0}, // 4
			{0,0,0,0,0,0,0,0}, // 5
			{0,0,0,0,0,0,0,0}, // 6
			{0,0,0,0,0,0,0,0}, // 7
			{0,0,0,0,0,0,0,0}, // 8
	};
	
	public Main(int mode, Vector<UserCredentials> UserStore){
		sc = new Scanner (System.in);
		if (mode == 1)
			boardGame = StartGame;
		else {
			if (architect())
				boardGame = CustomGame;
		}
		whiteMoves = 0;
		blackMoves = 0;
		
		turn = false; // false(0) = black; true(1) = white
		
		String userName = "";
		if (UserStore.isEmpty())
			userName = "Anonymous";
		else
			userName = UserStore.get(userActive).getName();
		
		Boolean haveZero = false;
		Boolean isValid = false;
		int x = 0;
		int y = 0;
		if (mode == 1 || CustomGame[7][7] != 9) {
			do {
				do {
					new RefreshPage();
					haveZero = board(userName);
					System.out.print(">>> ");
					if (haveZero) {
						inputReversi = sc.nextLine();
						isValid = validityCheck(inputReversi);
						if (!isValid && !inputReversi.toLowerCase().equals("invert")) {
							System.out.println("Illegal input or move!");
							sc.nextLine();
						}
						if (inputReversi.toLowerCase().equals("invert")) {
							blackDisk ^= whiteDisk;
							whiteDisk ^= blackDisk;
							blackDisk ^= whiteDisk;
						}
					}
				}while (inputReversi != "0" && !isValid && haveZero); // validity check 
				if (!inputReversi.equals("0")) {
					if (inputReversi.charAt(0) > 96)
						x = (int)(inputReversi.charAt(0)-97);
					else
						x = (int)(inputReversi.charAt(0)-65);
					y = (int)(inputReversi.charAt(1)-49);
					if (turn) {
						boardGame[y][x] = 2;
						whiteMoves++;
					}
					else {
						boardGame[y][x] = 1;
						blackMoves++;
					}
					turn = !turn; // Flips the turn
				}
			}while(!inputReversi.equals("0") && haveZero);
		}
		
		
	}
	
	@Override
	public Boolean board(String userName) {
		Boolean haveZero = false;
		blackPoints = -2;
		whitePoints = -2;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (boardGame[i][j] == 1) {
					blackPoints++;
				}
				else if (boardGame[i][j] == 2) {
					whitePoints++;
				}
			}
		}
		
		if (blackPoints < 0) 
			blackPoints = 0;
		if (whitePoints < 0)
			whitePoints = 0;
		
		TopBottom(true);
		System.out.printf("%s%c Black Disk - %c White Disk\n", "    ", blackDisk, whiteDisk);
		for (int i = 0; i < 8; i++) {
			System.out.print(i+1);
			for (int j = 0; j < 8; j++) {
				if (boardGame[i][j] == 0) {
					System.out.print(emptyDisk); // Prints empty block
					haveZero = true;
				}
				else if (boardGame[i][j] == 1)
					System.out.print(blackDisk);
				else
					System.out.print(whiteDisk);
			}
			System.out.print("#    ");
			switch (i) {
				case 1: System.out.printf("%-13s%c %s", "User", ':', userName); break;
				case 3: if (turn)
							System.out.print("White's Turn!");
						else 
							System.out.print("Black's Turn!");
						break;
				case 4: System.out.printf("%-13s%c %-5d%-13s%c %d","Black Moves", ':', blackMoves, "Black Points", ':', blackPoints); break;
				case 5: System.out.printf("%-13s%c %-5d%-13s%c %d","White Moves", ':', whiteMoves, "White Points", ':', whitePoints); break; 
				case 7: System.out.printf("%-13s%c %s","MOTD", ':', showHint((int)(Math.random()*12)));
			}
			System.out.println();
		}
		TopBottom(false);
		System.out.println();
		if (haveZero)
			return true;
		return false;
	}

	@Override
	public void TopBottom(Boolean arg)  {
		for (int i = 0; i < 10; i++) {
			if (arg && i != 0 && i != 9) {
				System.out.printf("%c", 64+i);
			} else {
				System.out.print("#");
			}		
		}
	}
	
	private Boolean validityCheck(String input) {
		// Case Input is 0
		if (input.equals("0")) {
			return true;
		}
		if (input.toLowerCase().equals("invert")) {
			return false;
		}
		// Case Input is out of bound
		if (input.length() == 2) {
			if (((input.charAt(0) > 96 && input.charAt(0) < 105) || (input.charAt(0) > 64 && input.charAt(0) < 73)) && 
				(input.charAt(1) > 48 && input.charAt(1) < 57)) {
				
				int xValid = 0;
				int yValid = 0;
				
				if (input.charAt(0) > 96)
					xValid = (int)(input.charAt(0)-97);
				else
					xValid = (int)(input.charAt(0)-65);
				yValid = (int)(input.charAt(1)-49);
					
				System.out.printf("Attempted array placement : X%d Y%d, ", xValid, (int)yValid);
				
					 
				if (boardGame[yValid][xValid] != 0) {
					return false;
				}
				
				int Self = 0;
				int Opponent = 0;
				 
				Boolean horizState = true; // true = no problem
				Boolean horizState_1 = true;
				Boolean horizState_2 = true;
				
				Boolean vertState = true; // true = no problem
				Boolean vertState_1 = true;
				Boolean vertState_2 = true;
				
				Boolean diag1State = true; // diag1 = / ; true = no problem.
				Boolean diag1State_1 = true;
				Boolean diag1State_2 = true;
				
				Boolean diag2State = true; // diag2 = \ ; true = no problem.
				Boolean diag2State_1 = true;
				Boolean diag2State_2 = true;
				
				Boolean tempState = false;
				
				int i = 0;
				int j = 0;
				
				if (turn){
					Self = 2;
					Opponent = 1;
				}
				else {
					Self = 1;
					Opponent = 2;
				}
				/*
				 * Horizontal Check needs left right checks
				 */
				i = yValid;						// Fixed y for Horizontal check
				
				/* TO THE RIGHT */
				for (j = xValid+1; j < 8; j++) { //checks from placed block to the right. //
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[i][xValid+1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							System.out.println("Trailing white right");
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int j2 = xValid; j2 < 8; j2++) {
						if (boardGame[i][j2] == 5) {
							boardGame[i][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					horizState_1 = false;
					for (int j2 = xValid; j2 < 8; j2++) {
						if (boardGame[i][j2] == 5) {
							boardGame[i][j2] = Opponent;
						}
					}
				}
				/* TO THE LEFT */
				for (j = xValid-1; j >= 0; j--) { //checks from placed block to the left.
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[i][xValid-1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							System.out.println("Trailing white left");
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int j2 = xValid; j2 >= 0; j2--) {
						if (boardGame[i][j2] == 5) {
							boardGame[i][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					horizState_2 = false;
					for (int j2 = xValid; j2 >= 0; j2--) {
						if (boardGame[i][j2] == 5) {
							boardGame[i][j2] = Opponent;
						}
					}
				}
				if(!(horizState_1 || horizState_2)) 
					horizState = false;
				
				
				
				/*
				 * Vertical Check needs up down checks
				 */
				j = xValid;							// Fixed x for Vertical check
						
				/* TO THE BOTTOM */
				for (i = yValid+1; i < 8; i++) { //checks from placed block to the bottom. //
					// yValid+1 checks vertical starting from the block under the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid+1][j] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid; i2 < 8; i2++) {
						if (boardGame[i2][j] == 5) {
							boardGame[i2][j] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					vertState_1 = false;
					for (int i2 = yValid; i2 < 8; i2++) {
						if (boardGame[i2][j] == 5) {
							boardGame[i2][j] = Opponent;
						}
					}
				}
				/* TO THE TOP */
				for (i = yValid-1; i >= 0; i--) { //checks from placed block to the top.
					// yValid+1 checks vertical starting from the block under the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid-1][j] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid; i2 >= 0; i2--) {
						if (boardGame[i2][j] == 5) {
							boardGame[i2][j] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					vertState_2 = false;
					for (int i2 = yValid; i2 >= 0; i2--) {
						if (boardGame[i2][j] == 5) {
							boardGame[i2][j] = Opponent;
						}
					}
				}
				if(!(vertState_1 || vertState_2)) 
					vertState = false;
				
				
				/*
				 * Diagonal 1 (/) Check needs up down checks
				 */
				// -/+ 1x +/- 1y each for changing pos diagonally 
						
				/* TO THE BOTTOM */
				for (i = yValid+1, j = xValid-1; i < 8 && j >= 0 ; i++, j--) { // checks from placed block to the bottom left. //
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid+1][xValid-1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid, j2 = xValid; i2 < 8 && j2 >= 0; i2++, j2--) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					diag1State_1 = false;
					for (int i2 = yValid, j2 = xValid; i2 < 8 && j2 >= 0; i2++, j2--) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Opponent;
						}
					}
				}
				/* TO THE TOP */
				for (i = yValid-1, j = xValid+1; i >= 0 && j < 8 ; i--, j++) { // checks from placed block to the right. //
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid-1][xValid+1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid, j2 = xValid; i2 >= 0 && j2 < 8; i2--, j2++) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					diag1State_2 = false;
					for (int i2 = yValid, j2 = xValid; i2 >= 0 && j2 < 8; i2--, j2++) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Opponent;
						}
					}
				}
				if(!(diag1State_1 || diag1State_2)) 
					diag1State = false;
				
				
				
				/*
				 * Diagonal 2 (\) Check needs up down checks
				 */
				// +/- 1x +/- 1y each for changing pos diagonally 
						
				/* TO THE BOTTOM */
				for (i = yValid+1, j = xValid+1; i < 8 && j < 8 ; i++, j++) { // checks from placed block to the bottom right. //
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid+1][xValid+1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid, j2 = xValid; i2 < 8 && j2 < 8; i2++, j2++) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					diag2State_1 = false;
					for (int i2 = yValid, j2 = xValid; i2 < 8 && j2 < 8; i2++, j2++) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Opponent;
						}
					}
				}
				/* TO THE TOP */
				for (i = yValid-1, j = xValid-1; i >= 0 && j >= 0 ; i--, j--) { // checks from placed block to the right. //
					// xValid+1 checks horiz starting from the block next to the newly placed disk and loops until it finds either white or empty cell (block)
						if (boardGame[yValid-1][xValid-1] == Self) { //no effect 
							break;
						}
						if (boardGame[i][j] == 0) {		//no effect with empty trail.
							break;
						}
						if (boardGame[i][j] == Self) {		//trailing white
							tempState = true;
							break;	
						}
						else //keeps flagging black disks
							boardGame[i][j] = 5;
				}
				if (tempState) { // for successful swap
					tempState = false;
					for (int i2 = yValid, j2 = xValid; i2 >= 0 && j2 >= 0; i2--, j2--) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Self;
						}
					}
				}
				else { 			// for unsuccessful swap
					tempState = false;
					diag2State_2 = false;
					for (int i2 = yValid, j2 = xValid; i2 >= 0 && j2 >= 0; i2--, j2--) {
						if (boardGame[i2][j2] == 5) {
							boardGame[i2][j2] = Opponent;
						}
					}
				}
				if(!(diag2State_1 || diag2State_2)) 
					diag2State = false;
				
				System.out.println("Validity Check: " + horizState + " " + vertState + " " + diag1State + " " + diag2State);
				
				if (horizState || vertState || diag1State || diag2State)
					return true;
			}
		}
		
		return false;
		
	}
	
	private String showHint(int index) {
		// TODO Auto-generated method stub
		switch(index) {
			case 0: return "Enter 0 to finish game.";
			case 1: return "You can start a custom game";
			case 2: return "The game is buggy.";
			case 3: return "Oh yeah yeah";
			case 4: return "Reversi is just another name of Othello.";
			case 5: return "According to wikipedia, Othello existed since 1883.";
			case 6: return "I like trains :)";
			case 7: return "This game was made using java.";
			case 8: return "The game is not very optimal codewise.";
			case 9: return "Alright Alright Alright!";
			case 10: return "If black and white seems off, you can try entering \"invert\" on the command.";
			case 11: return "Minimum terminal size is landscape 104x11.";
		}
		return "No Hint Available";
	}
	
	private Boolean architect() {
		String commandArchitect = "";
		for (int i1 = 0; i1 < 8; i1++) {
			for (int j1 = 0; j1 < 8; j1++) {
				new RefreshPage();
				TopBottom(true);
				System.out.println();
				for (int i = 0; i < 8; i++) {
					System.out.print(i+1);
					for (int j = 0; j < 8; j++) {
						if (CustomGame[i][j] == 0) {
							System.out.print("█");
						}
						else if (CustomGame[i][j] == 9)
							System.out.print("?");
						else if (CustomGame[i][j] == 1)
							System.out.print(blackDisk);
						else
							System.out.print(whiteDisk);
					}
					System.out.print("#    ");
					switch (i) {
						case 1: System.out.printf("%-13s%c %c%c", "Currently editing", ':', j1+65, i1+49); break;
						case 3: System.out.print("You are editing the custom Reversi Board!");break;
						case 4: System.out.print("Enter \'c\' to undo last change");break;
						case 5: System.out.print("Enter 0 for empty block, 1 for black disk, and 2 for white disk"); break; 
						case 7: System.out.print("Enter \'exit\' to exit Architect");
					}
					System.out.println();
				}
				TopBottom(false);
				System.out.println();
				System.out.print(">>> ");
				commandArchitect = sc.nextLine();
				if (commandArchitect.toLowerCase().equals("exit")) {
					return false;
				} 
				else if (commandArchitect.toLowerCase().equals("c")){
					if (i1 == 0 && j1 == 0) {
						System.out.println("Cannot undo further");
						if (j1 == 0) {
							j1 = 7;
							i1--;
						}
						else {
							j1--;
						}
						sc.nextLine();
					}
					else if (j1 == 0) {
						CustomGame[i1-1][7] = 9;
						j1 = 6;
						i1--;
					}
					else if (j1 == 1) {
						CustomGame[i1][0] = 9;
						j1 = 7;
						i1--;
					}
					else {
						CustomGame[i1][j1-1] = 9;
						j1-=2;
					}
				}
				else if (commandArchitect.equals("0"))
					CustomGame[i1][j1] = 0;
				else if (commandArchitect.equals("1")) {
					CustomGame[i1][j1] = 1;
				}
				else if (commandArchitect.equals("2")) {
					CustomGame[i1][j1] = 2;
				}
				else {
					if (j1 == 0) {
						j1 = 7;
						i1--;
					}
					else {
						j1--;
					}
					System.out.println("Unknown command!");
					
					sc.nextLine();
				}
				if ((i1 == 7 && j1 == 7) && CustomGame[7][7] != 9) {
					return true;
				}
			}
		}
		return false;
	}
}


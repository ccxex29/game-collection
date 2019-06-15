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
import core.RefreshPage;

public class Main extends Board{
	private Scanner sc;
	String inputReversi = "";
	int whiteMoves = 0;
	int blackMoves = 0;
	Boolean turn = false;
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
	
	private Integer [][] boardGame = {
			// Empty     = 0
			// Black     = 1
			// White     = 2
			// BlackTemp = 3
			// WhiteTemp = 4
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
	
	public Main(){
		sc = new Scanner (System.in);
		boardGame = StartGame;
		whiteMoves = 0;
		blackMoves = 0;
		turn = false; // false(0) = black; true(1) = white
		
		Boolean haveZero = false;
		Boolean isValid = false;
		int x = 0;
		int y = 0;
		do {
			do {
				new RefreshPage();
				haveZero = board();
				System.out.print(">>> ");
				inputReversi = sc.nextLine();
				isValid = validityCheck(inputReversi);
				if (!isValid) {
					System.out.println("Illegal input or move!");
					sc.nextLine();
				}
			}while (inputReversi != "0" && !isValid); // validity check 
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
			turn = !turn;
		}while(inputReversi != "0" && haveZero);
	}
	
	@Override
	public Boolean board() {
		// TODO Auto-generated method stub
		Boolean haveZero = false;
		TopBottom(true);
		for (int i = 0; i < 8; i++) {
			System.out.print(i+1);
			for (int j = 0; j < 8; j++) {
				if (boardGame[i][j] == 0) {
					System.out.print("█");
					haveZero = true;
				}
				else if (boardGame[i][j] == 1)
					System.out.print("B");
				else
					System.out.print("W");
			}
			System.out.print("#    ");
			switch (i) {
				case 2: System.out.print("User: "); break;
				case 3: System.out.print("Black Moves: " + blackMoves); break;
				case 4: System.out.print("White Moves: " + whiteMoves); break;
				case 5: if (turn)
							System.out.print("White's Turn!");
						else 
							System.out.print("Black's Turn!");
						break;
			}
			System.out.println();
		}
		TopBottom(false);
		if (haveZero)
			return true;
		else
			return false;
	}

	@Override
	public void TopBottom(Boolean arg)  {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (arg && i != 0 && i != 9) {
				System.out.printf("%c", 64+i);
			} else {
				System.out.print("#");
			}		
		}
		System.out.println();
	}
	
	private Boolean validityCheck(String input) {
		int xValid = 0;
		int yValid = 0;
		if (input.equals("0")) {
			return true;
		}
		if (((input.charAt(0) < 97 && input.charAt(0) > 104) && (input.charAt(0) < 65 && input.charAt(0) > 72)) || 
			(input.charAt(1) < 49 && input.charAt(1) > 56)) {
			return false;
		}
		System.out.println("Test");
		if (input.charAt(0) > 96)
			xValid = (int)(input.charAt(0)-97);
		else
			xValid = (int)(input.charAt(0)-65);
		yValid = (int)(input.charAt(1)-49);
//		System.out.printf("%d %d", xValid, (int)yValid);
		
		// Horiz Check
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++) {
//				
//			}
//		}
		return true;
	}
}


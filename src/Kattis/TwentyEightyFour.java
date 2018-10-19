/**
 * DAILY CODE DAY #1
 * 2048 Puzzle
 */


package Kattis;

import java.util.Scanner;

public class TwentyEightyFour {
	
	public static void solvePuzzle(int movement, int[][] game) {
		
		for (int i = 1; i < game.length-1; i++) {
			for (int j = 1; j < game.length-1; j++) {
				switch (movement)	{
				// move left
				case 0 : 
					if(game[i][j-1] == 0) {
						game[i][j-1] = game[i][j];
					}
					break;
				// move up
				case 1 : 
					if(game[i+1][j] == 0) {
						game[i+1][j] = game[i][j];
					}
					break;
				// move right
				case 2 : 
					if(game[i][j+1] == 0) {
						game[i][j+1] = game[i][j];
					}
					break;
				// move down
				case 3 : 
					if(game[i-1][j] == 0) {
						game[i-1][j] = game[i][j];
					}
					break;
				}
			}
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		
		int[][] game = new int[4][4];
		
		for (int i = 0; i < 4; i++)	{
			for (int j = 0; j < 4; j++) {
				game[i][j] = scanner.nextInt();
			}
		}
		while (scanner.hasNext()) {
			int movement = scanner.nextInt();
			counter ++;
			solvePuzzle(movement, game);
			if(counter == 3) {
				break;
			}
		}
		for (int i = 0; i < 4; i++)	{
			for (int j = 0; j < 4; j++) {
				System.out.println(game[i][j]);
			}
		}
	}
}

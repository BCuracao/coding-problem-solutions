package Hangman;

import java.util.Arrays;
import java.util.Scanner;


/* DAILY CODE DAY #18: Hangman*/
public class Game implements HangmanFactory {
	char input;
	final static char DEFAULTVALUE = '_';
	static char[] targetWord;
	static char[] playerSolution;
	
	public Game(char input) {
		this.input = input;
		checkInput(input);
	}
	private static void initializeGameWithWord(int wordLength) {
		playerSolution = new char[wordLength];
		Arrays.fill(playerSolution, DEFAULTVALUE);
		if (wordLength == 4) { targetWord = Catalogue.BIER.toString().toCharArray(); }
		else { targetWord = Catalogue.SONNE.toString().toCharArray(); }
	}	
	@Override
	public void checkInput(char input) {
		int matchingLetters = 0;
		for (int i = 0; i < targetWord.length; i++) {
			if (targetWord[i] == input) {
				matchingLetters++;
				playerSolution[i] = input;
				System.out.println("You guessed " + matchingLetters + " letter right");
				System.out.println("Updated game: ");
				print();
			}
		}
		if (playerSolution.equals(targetWord)) {
			System.out.println("You won!");
		}
	}
	public void print() {
		String solution = String.valueOf(playerSolution);
		System.out.println(solution);
	}
	
	public static void main(String[] args) {
		Game g;
		int numberOfTries = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick random word with a length between 4 and 5: ");
		int wordLength = scanner.nextInt();
		initializeGameWithWord(wordLength);
		while (numberOfTries < 3) {
			System.out.println("Make your " + (numberOfTries + 1) +  " guess: ");
			char letter = scanner.next().charAt(0);
			g = new Game(letter);
			numberOfTries++;
		}
		if (numberOfTries >= 3) System.out.println("You lost");
	}
}

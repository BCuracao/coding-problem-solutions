package Random;
import java.util.Arrays;
import java.util.Random;

/* DAILY CODE DAY #12 
 * @GeekforGeeks: COINS PUZZLE. You are blindfolded and 10 coins are place in front of you on table. 
 * You are allowed to touch the coins, but can’t tell which way up they are by feel. 
 * You are told that there are 5 coins head up, and 5 coins tails up but not which ones are which.
 * Can you make two piles of coins each with the same number of heads up? 
 * */
public class CoinsPuzzle {
	private static void generateArrayOfRandomCoins(int numberOfCoins) {
		char[] coins = new char[numberOfCoins];
		String headsOrTails = "HT";
		int MAXHEADS = 5, MAXTAILS = 5;
		Random r = new Random();

		// Fill array with randomly generated coins heads or tails up
		for (int i = 0; i < numberOfCoins; i++) {
			char c = headsOrTails.charAt(r.nextInt(headsOrTails.length()));
			if(c == 'H' && MAXHEADS > 0) {
				coins[i] = c;
				MAXHEADS--;
			}
		}
		solvePuzzle(coins);
	}
	private static void solvePuzzle(char[] coins) {
		// Split coins in two even arrays
		int middle = coins.length / 2;
		char[] firstHalf = new char[middle];
		char[] secondHalf = new char[middle];
		
		// Turn all the coins in the first half
		firstHalf = Arrays.copyOfRange(coins, 0, middle);
		for (int i = 0; i < firstHalf.length; i++) {
			if (firstHalf[i] == 'H') {
				firstHalf[i] = 'T';
			}
			else if (firstHalf[i] == 'T') {
				firstHalf[i] = 'H';
			}
		}
		// Fill another array with the second half
		secondHalf = Arrays.copyOfRange(coins, middle, coins.length);
		// Print both arrays
	}
	public static void main(String[] args) {
		int numberOfCoins = 10;
		generateArrayOfRandomCoins(numberOfCoins);
	}
}





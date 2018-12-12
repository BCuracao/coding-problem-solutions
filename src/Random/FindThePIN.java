package Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* DAILY CODE DAY #45 
 * You want to find the PIN to open a safe. You are given the keypadin form of the 2d array pinLock. 
 * The PIN could be 1357, but it is possible that each of the digits could actually be another adjacent digit 
 * (horizontally or vertically, but not diagonally).*/
public class FindThePIN {
	private static void findPossiblePinCombinations(int pin, int[][] pinLock) {
		char[] digits = ("" + pin).toCharArray();
		List<Integer> pinAsArray = new ArrayList<>();
		for (char c : digits) {
			pinAsArray.add(Integer.parseInt(Character.toString(c)));
		}
		Set<List<Integer>> allSets = new HashSet<>();
		for (int i = 0; i < pinLock.length; i++) {
			for (int j = 0; j < pinLock.length; j++) {

				if (pinAsArray.contains(pinLock[i][j])) {
					List<Integer> numberSets = new ArrayList<>();

					numberSets.add(pinLock[i][j]);
					if (i - 1 >= 0) {
						numberSets.add(pinLock[i - 1][j]);
					}
					if (i + 1 < pinLock.length) {
						numberSets.add(pinLock[i + 1][j]);
					}
					if (j + 1 < pinLock.length) {
						numberSets.add(pinLock[i][j + 1]);
					}
					if (j - 1 >= 0) {
						numberSets.add(pinLock[i][j - 1]);
					}
					allSets.add(numberSets);
				}
			}
		}
		calcCombinations(allSets);
	}
	// Calculate number of possible combinations
	private static void calcCombinations(Set<List<Integer>> allSets) {

		int[][] arr = new int[allSets.size()][allSets.size()];
		int i = 0;
		int numberOfPossibleCombinations = 0;

		// add list of numbers to 2d array
		for (int j = 0; allSets.iterator().hasNext(); j++) {
			arr[j] = allSets.iterator().next().stream().mapToInt(Integer::intValue).toArray();
		}
		// Calc combinations between the arrays. TODO: left out or it wouldnt fit in the screenshot
	}
	public static void main(String[] args) {
		int pin = 1357;
		int[][] pinLock = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		findPossiblePinCombinations(pin, pinLock);
	}
}




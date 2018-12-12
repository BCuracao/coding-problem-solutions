package Random;
import java.util.Arrays;

/* DAILY CODE DAY #42 
 * Write a function that takes an integer value n as input and
 * prints the first n lines of the Pascal's triangle
 * Pascal's triangle for n = 5
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class Pascals {

	private static void createTriangle(int size) {

		int[][] triangle = new int[size][size];
		for (int[] is : triangle) {
			Arrays.fill(is, 1);
		}
		int[][] result = new int[size][size];
		int col;
		for (int row = 0; row < size; row++) {
			for (col = 0; col <= row; col++) {
				if (row - 1 < 0 || col - 1 < 0) {
					result[row][col] = 1;

				} else {
					result[row][col] = (result[row - 1][col - 1] 
							+ result[row - 1][col]);
				}
				System.out.print(result[row][col]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int size = 5;

		createTriangle(size);

	}
}






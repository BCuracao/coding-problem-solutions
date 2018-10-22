package HackerRank;

/* DAILY CODE DAY #6 
 * @Hackerrank: Given a square matrix, calculate the absolute 
 * difference between the sums of its diagonals.*/
public class DiagonalDifference {
	
	private static int calcDifference(int[][] input) {
		int mainDiag = 0;
		int antiDiag = 0;
		
		for(int i = 0; i < input.length; i++)	{
			// Sum of the main diagonal
			mainDiag += input[i][i];
			// Sum of the anti diagonal
			antiDiag += input[i][input.length - i-1];
		}
		// return the absolute value between the two diagonals
		return Math.abs(mainDiag - antiDiag);
	}

	public static void main(String[] args) {
		int[][] input = new int[][] {
			{11, 2, 4},
			{4, 5, 6},
			{10, 8, -12}
		};
		System.out.println(calcDifference(input));
	}
}






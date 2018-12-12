package Random;

/* DAILY CODE DAY #1 
 * 	Any live cell with fewer than two live neighbors dies, as if by underpopulation.
 *	Any live cell with two or three live neighbors lives on to the next generation.
 *	Any live cell with more than three live neighbors dies, as if by overpopulation.
 *	Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 **/
public class ConwaysGameOfLife {
	private static void playTheGame(int[][] grid, int row, int col, int gen) {
		int[][] newGen = new int[row][col];
		
		while(gen > 0) {
			for (row = 1; row < grid.length-1; row++) {
				for (col = 1; col < grid.length-1; col++) {
					int neighbours = 0;
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							if (grid[row + i][col + j] == 1) {
								neighbours++;
							}
						}
					}
					neighbours -= grid[row][col];
					
					if (grid[row][col] == 1) {
						if (neighbours < 2) {
							newGen[row][col] = 0;
						}
						if (neighbours > 3) {
							newGen[row][col] = 0;
						}
						else {
							newGen[row][col] = grid[row][col];
						}
					} else if (grid[row][col] == 0) {
						if (neighbours == 3) {
							newGen[row][col] = 1;
						}
						else {
							newGen[row][col] = grid[row][col];
						}
					}
				}
			}
			System.out.println("New generation: ");
			for(int i = 0; i < grid.length; i++) {
				for(int j = 0; j < grid[i].length; j++) {
					System.out.print(newGen[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			grid = newGen;
			gen--;
		}
	}
	public static void main(String[] args) {

		int[][] grid = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		
		int row = grid.length;
		int col = grid[0].length;
		int generations = 3;

		playTheGame(grid, row, col, generations);
	}
}

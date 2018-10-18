


/* DAILY CODE DAY #1 
 * Determine in which mathematical quadrant a given point lies in.
 * The first line of input contains the integer x != 0
 * The second line of input contains the integer y != 0
*/
	
package Kattis;

import java.util.Scanner;

public class QuadrantSelection {
	
	public static int determineQuadrant(int x, int y)	{
		if(x > 0 && y > 0) {
			return 1;
		}
		if(x > 0 && y < 0) {
			return 4;
		}
		if(x < 0 && y < 0) {
			return 3;
		}
		if(x < 0 && y > 0) {
			return 2;
		}
		else {
			return 0;	
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(determineQuadrant(x, y));
	}
}

				
				
				
				
				
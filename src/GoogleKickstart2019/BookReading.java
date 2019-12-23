package GoogleKickstart2019;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class BookReading {
	
	private static long startTime = System.currentTimeMillis();
	
	static void TestCase() {
		int n, m, q; // Number of pages; Number of torn out pages; number of readers

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		q = scanner.nextInt();
		
		boolean[] tornPages = new boolean[n+1];
		Arrays.fill(tornPages, true);

		for (int i = 0; i < m; i++) {
			int t = scanner.nextInt();
			tornPages[t] = false;
		}
		
		int answer = 0;
		
		while(q > 0) {

			int x = scanner.nextInt();
			
			for (int i = 1; i < tornPages.length; i++) {
				if (tornPages[i] == true && i % x == 0) {
					answer++;
				}
			}
			q--;
		}
		System.out.println(answer);
		
	}
	
	public static void main(String[] args) {
		TestCase();
		long endTime = System.currentTimeMillis();
		System.out.println("It took " + (endTime - startTime) + " milliseconds");
	}
}

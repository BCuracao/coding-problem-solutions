package GoogleKickstart2019;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Mural {
	
	// example input 1: 4 4 9583	-- output : 14
	// example input 2: 4 4 1332	-- output : 6
	// example input 2: 4 3 616		-- output : 7
		
	private static void solve(List<Integer> score) {
		int max = Collections.max(score);
		int steps = (int) Math.ceil((double)score.size() / 2) - 1;
		
		int stepLeft = -1, stepRight = 1;
		int scoreLeft = 0, scoreRight = 0;
		
		int maxIndex = score.indexOf(max);	
		int answer = score.get(score.indexOf(max));
		
		while (steps > 0) {
			if (score.indexOf(maxIndex + stepLeft) > 0) {
				scoreLeft += score.get(maxIndex + stepLeft); // out of index
				stepLeft++;
			}
			if (score.indexOf(maxIndex + stepRight) < score.size()-1) {
				scoreRight += score.get(maxIndex + stepRight); // out of index
				stepRight++;
			}
			steps--;
		}
		
		stepLeft = 1;
		stepRight = 1;
		steps = (int) Math.ceil((double)score.size() / 2) - 1;
		
		for (int i = 0; i < steps; i++) {
			answer += ((scoreLeft > scoreRight) ? score.get(maxIndex + stepLeft) : score.get(maxIndex + stepRight));
			stepLeft++;
			stepRight++;
		}
		System.out.println("answer " + answer);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int n = scanner.nextInt();
			List<Integer> score = new LinkedList<Integer>();
			
			for (int j = 0; j < n; j++) {
				score.add(scanner.nextInt());
			}
			solve(score);
		}
	}
}

package GoogleKickstart2019;

import java.util.Scanner;

class Solution {
	
	public static void search(Scanner scanner, int low, int high) {
		int mid = (low + high) / 2;
		System.out.println(mid);
		String response = scanner.next();
		
		if (response.equals("CORRECT")) {
			return;
		}
		else if (response.equals("TOO_SMALL")) {
			low = mid + 1;
			search(scanner, low, high);
		}
		else {
			high = mid - 1;
			search(scanner, low, high);
		}		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();	
		for (int i = 1; i <= testCases; i++) {
			int low = scanner.nextInt();
			int high = scanner.nextInt();
			int tries = scanner.nextInt();
			
			search(scanner, low + 1, high);
		}		
	}
}

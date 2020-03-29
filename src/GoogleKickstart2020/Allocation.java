package GoogleKickstart2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Allocation { // rename to Solution for submission
	
	public static void main(String[] args) {
		
		int n, b; // n = number of houses for sale; b = budget available

		int[] ch;
				
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = scanner.nextInt(); // number of test cases
		int ct = 0;
		
		while (t > 0) {

			ct++;
			n = scanner.nextInt();
			b = scanner.nextInt();
			
			ch = new int[n];
			
			for(int i = 0; i < n; i++) {
				ch[i] = scanner.nextInt();
			}
			Arrays.sort(ch);
			int ans = 0;
			
			for (int i = 0; i < n; i++) {
				if (b >= ch[i]) {
					ans++;
					b -= ch[i];
				}
			}
			System.out.println("Case #" + ct + ": " + ans);
			t--;
		}
	}
}

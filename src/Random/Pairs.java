package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  DAILY CODE DAY #2 
 *  Given an array of integers, find pairs that sum up to the number 9.
 *  Be as efficient as possible 
 *  */
public class Pairs {
	
	private static void findPairs(int[] input) {
		Arrays.sort(input);
		int firstIndex = 0;
		int lastIndex = input.length-1;
		int sum = 0;
		int midPoint = input.length / 2;
		List<Integer> result = new ArrayList<Integer>();
		
		while (firstIndex <= midPoint &&  lastIndex >= midPoint) {
			sum = input[firstIndex] + input[lastIndex];
			if (sum == 9) {
				result.add(input[firstIndex]);
				result.add(input[lastIndex]);
				lastIndex--;
				firstIndex++;
			}
			if (sum > 9) {
				lastIndex--;
			}
			if(sum < 9) {
				firstIndex++;
			}
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {
				1, 8, 6, 5, 4, 7, 3
		};
		findPairs(input);
	}
}




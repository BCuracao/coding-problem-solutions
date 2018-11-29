

/* DAILY CODE DAY #37
 * @LeetCode: Single Element in a Sorted Array 
 * Given a sorted array consisting of only integers where every 
 * element appears twice except for one element which appears once. 
 * Find this single element that appears only once.
 * 
 * Note: Your solution should run in O(log n) time and O(1) space.
 * */
package Leetcode;

public class SingleElementSortedArray {

	private static int findSingleElement(int[] input) {
		int start = 0;
		int end = input.length - 1;

		while (start < end) {

			int mid = (start + end) / 2;
			if (mid % 2 == 1)
				mid--;
			// If numbers at mid and mid+1 are a pair, then all numbers 
			// before must be pairs too
			if (input[mid] != input[mid + 1])
				//Single number must be in the left half
				end = mid;

			// Single number must be in the right half;
			else
				start = mid + 2;
		}
		// Solution is at start index
		return input[start];
	}

	public static void main(String[] args) {
		int[] input = new int[] { 
				0, 0, 1, 1, 3, 3, 8, 8, 9
		};
		System.out.println(findSingleElement(input));
	}

}






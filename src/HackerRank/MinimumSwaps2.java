package HackerRank;

/* DAILY CODE DAY #36 
 * @HackerRank: Minimum Swaps 2: 
 * ou are given an unordered array consisting of consecutive integers [1, 2, 3, ..., n] 
 * without any duplicates. You are allowed to swap any two elements. You need to find 
 * the minimum number of swaps required to sort the array in ascending order.*/

/*	-- WARNING: This solution does not pass all of the cast cases due to timeout.	--*/
/*	-- Needs to be heavily optimized.	--*/
public class MinimumSwaps2 {

	private static int[] sortAscending(int[] arr) {
		int n = arr.length;
		int swapCounter = 0;
		int swapValue = 0;
		int index = 0;

		for (int i = 0; i < n; i++) {
			int minElement = Integer.MAX_VALUE;
			int j = i + 1;
			swapValue = arr[i];
			for (; j < arr.length; j++) {
				if (arr[j] < minElement) {
					index = j;
					minElement = arr[j];
				}
			}
			if (swapValue > minElement) {
				arr[i] = minElement;
				arr[index] = swapValue;
				swapCounter++;
			}
		}
		System.out.println("Number of swap required: " + swapCounter);
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 1, 3, 2, 4, 5, 6 };

		sortAscending(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}








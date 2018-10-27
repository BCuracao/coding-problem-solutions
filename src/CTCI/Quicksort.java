package CTCI;

/* DAILY CODE DAY #9 
 * @Cracking the coding interview: Quicksort implementation*/

public class Quicksort {
	
	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);
		
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			while(array[left] < pivot) {
				left++;
			}
			
			while(array[right] > pivot) {
				right--;
			}
			
			if(left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	private static void swap(int[] array, int left, int right) {
		int ph = array[left];
		array[left] = array[right];
		array[right] = ph;	
	}
	public static void main(String[] args) {
		int[] arrayToSort = new int[] {
				15, 3, 2, 1, 9, 5, 7, 8, 6
		};
		quicksort(arrayToSort);
	}
}

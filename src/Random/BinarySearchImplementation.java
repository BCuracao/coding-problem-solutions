package Random;
import java.util.Arrays;


/* DAILY CODE DAY #11
 * Eggs dropping puzzle: Given a 40 story building and the highest floor you can 
 * drop an egg from without breaking it, implement an algorithm to find that floor
 * using as few eggs as possible */
public class BinarySearchImplementation {
	
	private static int binarySearch(int[] ladder, int floor) {
		int eggsCounter = 0;
		int firstIndex = 0;
		int lastIndex = ladder.length-1;
		int foundIndex = 0;
		int mid;
		
		while (firstIndex <= lastIndex) {
			eggsCounter++;
			mid = (firstIndex + lastIndex) / 2;
			if (ladder[mid] < floor) {
				firstIndex = mid + 1;
			}
			else if(ladder[mid] > floor) {
				lastIndex = mid - 1;
			}
			else {
				foundIndex = mid;
				break;
			}
		}
		System.out.println(eggsCounter);
		return foundIndex;
	}

	public static void main(String[] args) {
		int[] ladder = new int[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40
		};
		
		int floor = 17;
		System.out.println(binarySearch(ladder, floor));
	}
}



package Random;



/* DAILY CODE DAY #32 
 * Trapping Rain Water: Given n non-negative integers representing 
 * an elevation map where the width of each bar is 1, 
 * compute how much water it is able to trap after raining.*/
public class TrappingRain {

	private static int findWater(int[] bars) {
		int sum = 0;
		int maxLeft = 0, maxRight = 0;
		int leftP = 0;
		int rightP = bars.length-1;

		while (leftP <= rightP) {
			if(bars[leftP] < bars[rightP]) {
				if(bars[leftP] > maxLeft) {
					maxLeft = bars[leftP];
				}
				else {
					sum += maxLeft - bars[leftP];
					leftP++;
				}
			}
			else {
				if(bars[rightP] > maxRight) {
					maxRight = bars[rightP];
				}
				else {
					sum += maxRight - bars[rightP];
					rightP--;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] bars = new int[] { 3, 0, 0, 2, 0, 4 };

		System.out.println(findWater(bars));
	}
}






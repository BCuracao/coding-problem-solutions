/* DAILY CODE DAY #1 */
package Leetcode;

public class CountingBits {
	
	private static void countBitsInRange(int input) {
		// + 1 to keep the leading 0
		int[] result = new int[input+1];
		String binary = Integer.toString(input);
		
		while (input > 0)	{
			binary = Integer.toBinaryString(input);
			
			for (int i = 0; i < binary.length(); i++) {
				if(result[i] >= 1 && binary.charAt(i) == '1') {
					result[i] += 1;
				}
				if(result[i] == 0 && binary.charAt(i) == '1') {
					result[i] = Character.getNumericValue(binary.charAt(i));
				}

			}
			input--;
		}
		for(int i = 0; i < result.length; i++)	{
			System.out.print(result[i]);
		}
		System.out.println();
		for(int j = result.length - 1; j >= 0; j--) {
			System.out.print(result[j]);
		}
		
	}

	public static void main(String[] args) {
		int input = 5;
		countBitsInRange(input);

	}
}

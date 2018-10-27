package Kattis;


/* DAILY CODE DAY #8
 * @Open.Kattis: Your task will be to write a program for reversing 
 * numbers in binary. For instance, the binary representation 
 * of 13 is 1101, and reversing it gives 1011, which corresponds to number 11.
 *  */

public class ReverseBinary {
	
	private static int reverseBinary(int input) {
		
		// Convert integer to binary string
		String binary = Integer.toBinaryString(input);
		// String builder to build result string
		StringBuilder s = new StringBuilder();
		
		// Check of 0 and 1 and reverse it
		for (int i = 0; i < binary.length(); i++) {
			switch(binary.charAt(i)) {
			case '0':
				s.append("1");
				break;
			case '1':
				s.append("0");
				break;
			}
		}
		// Convert result string from binary to base 10 integer
		int reversed = Integer.parseInt(s.toString(), 2);
		return reversed;
	}

	public static void main(String[] args) {
		int input = 47;
	
		System.out.println(reverseBinary(input));
	}
}




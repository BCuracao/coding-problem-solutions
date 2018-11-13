/* DAILY CODE DAY #27 */
package Random;

/* DAILY CODE DAY #27 
 * @Codility: BinaryGap
 * A binary gap within a positive integer N is any maximal sequence of 
 * consecutive zeros that is surrounded by ones at both ends in the binary 
 * representation of N. For example, number 9 has binary representation 1001 
 * and contains a binary gap of length 2. The number 529 has binary representation 
 * 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. 
 * The number 15 has binary representation 1111 and has no binary gaps. The number 32 
 * has binary representation 100000 and has no binary gaps.*/
public class BinaryGap {

	private static int solution(int input) {
		String binary = Integer.toBinaryString(input);
		char[] test = binary.toCharArray();
		int zeroCounter = 0;

		for (int i = 0; i < test.length; i++) {
			if (test[i] == '0') {
				while (test[i] == '0' && i < test.length) {
					zeroCounter++;
					if (i < test.length - 1) {
						i++;
					} else {
						break;
					}
				}
				if (i == test.length - 1 && test[i] != '1') {
					zeroCounter = 0;
				}
				return zeroCounter;
			}
		}
		return zeroCounter;
	}

	public static void main(String[] args) {
		int input = 15;
		System.out.println(solution(input));
	}
}






package Random;


/* DAILY CODE DAY #32 
 * Levenhstein distance:
 * Given two strings str1 and str2 and below operations that can performed on str1. 
 * Find minimum number of edits (operations) required to convert str1 into str2.
 * The operations are: 1) insert, 2) remove, 3) replace */
public class LevenhsteinDistanceRecursiv {

	private static int findMinDistance(char[] s1, char[] s2, int l1, int l2) {

		if (l1 == 0) {
			return l2;
		}
		if (l2 == 0) {
			return l1;
		}

		if (s1[l1 - 1] == s2[l2 - 1]) {
			return findMinDistance(s1, s2, l1 - 1, l2 - 1);
		}

		return minimum(findMinDistance(s1, s2, l1 - 1, l2 - 1), 
				findMinDistance(s1, s2, l1 - 1, l2),
				findMinDistance(s1, s2, l1, l2 - 1)) + 1;
	}

	private static int minimum(int a, int b, int c) {
		int temp = Math.min(a, b);
		return Math.min(temp, c);
	}

	public static void main(String[] args) {
		String s1 = "geekeees";
		String s2 = "gesakszz";

		int l1 = s1.length();
		int l2 = s2.length();

		System.out.println(findMinDistance(s1.toCharArray(), s2.toCharArray(), l1, l2));
	}
}







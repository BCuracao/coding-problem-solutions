
package Random;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * DAILY CODE DAY #40
 * Return the number of all possible permutations of a given number.
 * No duplicates and no leading zeroes allowed
 */
public class Perm {

	private static int getLength(int n) {
		String s = Integer.toString(n);
		s = s.replaceAll("0", "");
		System.out.println(permute(s));

		return permute(s).size();

	}

	public static Set<String> permute(String str) {
		Set<String> res = new LinkedHashSet<>();
		if (str.isEmpty()) {
			res.add(str);
		} else {
			for (int i = 0; i < str.length(); i++) {
				for (String s : permute(str.substring(0, i) + 
						str.substring(i + 1))) {
					res.add(str.charAt(i) + s);
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int n = 123;
		System.out.println(getLength(n));
	}

}







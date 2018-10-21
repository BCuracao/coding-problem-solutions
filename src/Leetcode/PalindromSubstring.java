
package Leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/* DAILY CODE DAY #5 
 * @Leetcode: Given a string, find the longest EVEN palindrome substring in the string. 
 * */
public class PalindromSubstring {
	
	List<String> resultList = new ArrayList<String>();
	Optional<String> longestPalindrom;
	
	public PalindromSubstring(String input) {
		longestPalindromSubstring(input);
	}

	private void longestPalindromSubstring(String input) {
		char[] array = input.toCharArray();
		String palindrom = "";

		for (int i = 1; i < array.length; i++) {
			int pointerA = i-1;
			int pointerB = i;
			
			while (array[pointerA] == array[pointerB] && pointerA > 0 
					&& pointerB < array.length-1) {
				if (pointerA > 0) {
					pointerA--;
				}
				if (pointerB < array.length) {
					pointerB++;
				}
			}
			palindrom = input.substring(pointerA+1, pointerB);		
			resultList.add(palindrom);
		}
		longestPalindrom = resultList.stream()
				.max(Comparator.comparing(String::length));
		System.out.println("Longest palindrom: " + longestPalindrom.get());
	}
	public static void main(String[] args) {
		String input = "babaddaadddaaadadaaddaab";
		PalindromSubstring s = new PalindromSubstring(input);		
	}
}




package Leetcode;

import java.util.Arrays;

/**
 *  DAILY CODE DAY #4 
 *  Given an array of strings find the common prefix of all strings
*/
public class CommonPrefix {
	
	private static String longestCommonPrefix(String[] input) {
		
		if (input.length == 0) {
			return "Empty string";
		}
		
		StringBuilder s = new StringBuilder();
		Arrays.sort(input);
		String firstString = input[0];
		String lastString = input[input.length-1];
		
		for (int i = 0; i < firstString.length(); i++) {
			if(firstString.charAt(i) == lastString.charAt(i)) {
				s.append(firstString.charAt(i));
			}
		}
		String commongPrefix = s.toString();
		return commongPrefix;
	}

	public static void main(String[] args) {
		String[] input = new String[] {
				"flower","flow","flight"
		};
		System.out.println(longestCommonPrefix(input));
	}
}






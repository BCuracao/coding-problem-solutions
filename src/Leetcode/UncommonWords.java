
package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


/* DAILY CODE DAY #20 
 * @Leetcode: We are given two sentences A and B. A sentence is a string of space separated words.  
 * Each word consists only of lowercase letters. A word is uncommon if it appears exactly once 
 * in one of the sentences, and does not appear in the other sentence.
 * Return a list of all uncommon words. */
public class UncommonWords {
	
	static List<String> result = new ArrayList<String>();

	public static void main(String[] args) {
		
		String inputA = "this apple is sweet";
		String inputB = "this apple is sour";
		// Expected output ["sweet", "sour"]
		findTheWords(inputA, inputB);
	}

	private static void findTheWords(String inputA, String inputB) {
		
		String[] Ainput = inputA.split(" ");
		String[] Binput = inputB.split(" ");
		
		// If arrays share the same word, delete it
		for (int i = 0; i < Ainput.length; i++) {
			for (int j = 0; j < Binput.length; j++) {
				if (Ainput[i].equals(Binput[j])) {
					Ainput[i] = "";
					Binput[j] = "";
				}	
			}
		}
		// Merge both arrays
		Object[] merged = Stream.concat(Arrays.stream(Ainput), Arrays.stream(Binput)).toArray();
		for (int i = 0; i < merged.length; i++) {
			if(merged[i] != "") {
				result.add((String)merged[i]);
			}

		}
		System.out.println(result);
	}
}



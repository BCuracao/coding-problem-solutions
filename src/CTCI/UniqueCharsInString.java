package CTCI;

/* DAILY CODE DAY #17 
 * @Cracking the coding interview: Given a string, 
 * Determine if the string has all unique characters.
 * Time Complexity O(n)
 * */

public class UniqueCharsInString {
	
	final static int MAXCHARS = 256;
	
	private static boolean checkUnique(String input) {
		
		boolean[] charsToCheck = new boolean[MAXCHARS];
		int charPos = 0;
		
		for(int i = 0; i < input.length(); i++) {
			charPos = input.charAt(i);
			if(charsToCheck[charPos]) {
				return false;
			}
			else {
				charsToCheck[charPos] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "abcdefghijklmnopaqrstuvwxyzöäü";
		System.out.println(checkUnique(s));
	}
}




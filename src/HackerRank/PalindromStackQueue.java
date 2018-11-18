package HackerRank;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



/* DAILY CODE DAY #29 
 * @HackerRank Qeues and Stacks:
 * A palindrome is a word, phrase, number, or other sequence of characters which 
 * reads the same backwards and forwards.  Can you determine if a given string, 
 * is a palindrome, using a queue and stack?*/

public class PalindromStackQueue {

	public PalindromStackQueue(String s) {
		checkIfPalindrome(s);
	}

	private void checkIfPalindrome(String input) {
		Stack<Character> s = new Stack<Character>();
		Queue<Character> q = new LinkedList<>();

		char[] chars = input.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			s.push(chars[i]);
			q.add(chars[i]);
		}

		int count = s.size();
		while (!s.isEmpty()) {
			if (s.peek() == q.peek()) {
				s.pop();
				q.remove();
			} else {
				System.out.println("The word " + input + " is no palindrome");
				break;
			}
		}
		System.out.println("The word " + input + " is a palindrome");
	}

	public static void main(String[] args) {
		String input = "raceezyrcar";
		PalindromStackQueue p = new PalindromStackQueue(input);
	}
}






package Random;
import java.util.Stack;


/* 
 * DAILY CODE DAY #3 
 * Check matching open and closing brackets.
 * Return true if correct, false it wrong
*/
public class OpenClosingBrackets {
	
	private static boolean matchingBrackets(char[] brackets) {
		if(brackets.length == 0) {
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brackets.length; i++) {
			if (brackets[i] == '(' || brackets[i] == '{' || brackets[i] == '[') {
				stack.push(brackets[i]);
			}
			
			if (brackets[i] == ')' || brackets[i] == '}' || brackets[i] == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char topOfStack = stack.peek();
				if(brackets[i] == ')' && topOfStack == '(' || brackets[i] == '}' && topOfStack == '{' 
						|| brackets[i] == ']' && topOfStack == '[') {
					
					stack.pop();
				}
				else 
					return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		char[] brackets = new char[] {
				'(', '{', '{', '[', '(', 
				'[', '(', '{', '[', '(', 
				')', ']', '}', ')', ']', 
				')', ']', '}', '}', ')'		
		};
		System.out.println(matchingBrackets(brackets));
	}
}

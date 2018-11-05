package CodingBat;



/* DAILY CODE DAY #15 
 * @CodingBat: Basic recursion problems
 * */
public class RecursionBasics {
	public static void main(String[] args) {
		int fibInput = 4;
		fibonacciSequence(fibInput);
		int bunnies = 3;
		calcBunnyEars(bunnies);
		int facInput = 4;
		factorial(facInput);
	}
	// Given n of 1 or more, return the factorial of n
	private static int factorial(int facInput) {
		if(facInput == 1) {
			return 1;
		}
		else {
			return facInput * factorial(facInput-1);
		}
	}
	// Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
	// with n=0 representing the start of the sequence.
	private static int fibonacciSequence(int fibInput) {
		if (fibInput == 0) {
			return 0;
		}
		if (fibInput == 1) {
			return 1;
		}
		else {
			return fibonacciSequence(fibInput-2) + fibonacciSequence(fibInput-1);
		}	
	}
	// Recursively return the number of "ears" in the bunny line 1, 2, ... n 
	// (without loops or multiplication).
	private static int calcBunnyEars(int bunnies) {
		// Even bunnies have 3 ears, odd have 2
		if (bunnies == 0) {
			return 0;
		}
		if (bunnies == 1) {
			return 2;
		}
		else {
			if (bunnies%2 == 0) return 3 + calcBunnyEars(bunnies-1);
			else return 2 + calcBunnyEars(bunnies-1);
		}
	}
}



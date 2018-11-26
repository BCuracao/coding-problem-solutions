package Random;

/* DAILY CODE DAY #34
 * Find nth prime number */
public class FindPrime {

	private static void findPrimeAtPos(int prime) {
		int counter = 0;

		for (int i = 1;; i++) {
			if (isPrime(i)) {
				counter++;
			}

			if (counter == prime) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int prime = 6;

		findPrimeAtPos(prime);
	}
}






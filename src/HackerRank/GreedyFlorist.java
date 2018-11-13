package HackerRank;
import java.util.Arrays;

/* DAILY CODE DAY #26 
 * @HackerRank: A group of friends want to buy a bouquet of flowers. 
 * The florist wants to maximize his number of new customers and the money he makes. 
 * To do this, he decides he'll multiply the price of each flower by the number of 
 * that customer's previously purchased flowers plus 1. 
 * The first flower will be original price (0 + 1) * original price,
 * the next will be (1+1)*original price and so on. Given the size of the 
 * group of friends, the number of flowers they want to purchase and the original prices 
 * of the flowers, determine the minimum cost to purchase all of the flowers.*/
public class GreedyFlorist {

	private static int getMinimumCost(int friends, int[] price) {
		// Sort in ascending order
		Arrays.sort(price);
		int cost = 0;
		int purchased = 0;
		int flowers = price.length - 1;

		// As long as there are still flowers left to buy
		while (flowers >= 0) {
			// Every friend buys a flower
			for (int i = 0; i < friends && flowers >= 0; i++) {
				cost += (purchased + 1) * price[flowers];
				// For every bought flower reduce the number of flowers by one
				flowers--;
			}
			// Everyone bought one flower, the next one will be more expensive
			purchased++;
		}
		return cost;
	}

	public static void main(String[] args) {
		int friends = 2;

		int[] price = new int[] { 2, 5, 6 };

		System.out.println(getMinimumCost(friends, price));
	}

}




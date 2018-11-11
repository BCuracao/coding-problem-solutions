package Random;



/* DAILY CODE DAY #23 
 * Find all the subsets of a given array.*/
public class AlleTheSubsets {
	
	private static void printSubsets(char[] set) {

        int n = set.length; 
        // Possible number of subsets n^2
        int power = (int) Math.pow(n, 2);
  
        for (int i = 0; i < power; i++) 
        { 
            System.out.print("{ "); 
  
            // Print current subset 
            for (int j = 0; j < n; j++) {
            	
            	// Check if binary of i AND binary of 1 
            	// leftshifted j times equal 1
                if ((i & (1 << j)) > 0) {
                    System.out.print(set[j] + " "); 
                }
            }
            System.out.println("}"); 
        } 
    } 
	  
	public static void main(String[] args) {
		char[] set = new char[] {
				'a', 'b', 'c'
		};
		
		printSubsets(set);
	}
}






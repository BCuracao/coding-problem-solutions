/* DAILY CODE DAY #1 */
package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* DAILY CODE DAY #30 
 * @HackerRank: Given an array of n Player objects, write a comparator 
 * that sorts them in order of decreasing score; if 2 or more players have 
 * the same score, sort those players alphabetically by name*/

public class CompareScore implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {

		if (o1.score - o2.score == 0) {
			return o1.name.compareTo(o2.name);
		} else {
			return o2.score - o1.score;
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Player> players = new ArrayList<>();
		players.add(new Player("Aleksa", 150));
		players.add(new Player("Amy", 100));
		players.add(new Player("David", 100));
		players.add(new Player("Aamy", 100));
		players.add(new Player("Aakansha", 75));
		players.add(new Player("Heraldo", 50));
		
		Collections.sort(players, new CompareScore());
		for (int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i));
		}
	}
}
class Player {
	String name;
	int score;

	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return this.name + " " + this.score;
	}
}





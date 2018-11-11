
package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

/* DAILY CODE DAY #25 
 * @OpenKattis: Secure Doors
 * You need to write a simple software auditor for tracking employees entering and exiting 
 * your building using their access cards (each card uniquely identifies the employee 
 * holding the card). Your software needs to look at the access log and determine if there 
 * are any anomalies. There are two types of anomalies your software should detect:
 * 		1: a user entering the building when, they are already supposed to be in the building
 * 		2: a user exiting the building when, they are not supposed to be in the building
 * 
 * For each person’s entry or exit, print the name of the person, 
 * followed by entered or exited. If the action is anomalous, print (ANOMALY) afterward.
 * */
public class SecureDoors {

	ArrayList<String> employee;

	public SecureDoors() {
		trackEmployees();
	}

	private void trackEmployees() {
		Scanner scanner = new Scanner(System.in);
		int logCount = scanner.nextInt();
		employee = new ArrayList<>();

		while (logCount >= 0) {
			String[] input = scanner.nextLine().split(" ");

			if (input[0].equals("entry") && employee.contains("entry" + " " + input[1])) {
				employee.add(input[0] + " " + input[1] + " (ANOMALY)");
			} else if (input[0].equals("exit") && employee.contains("exit " + input[1])) {
				employee.add(input[0] + " " + input[1] + " (ANOMALY)");
			} else if (input[0].equals("exit") && !employee.contains("entry " + input[1])) {
				employee.add(input[0] + " " + input[1] + " (ANOMALY)");
			} else if (input[0].equals("entry")) {
				employee.add(input[0] + " " + input[1]);
			}
			logCount--;
		}
		for (String s : employee) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new SecureDoors();

	}
}





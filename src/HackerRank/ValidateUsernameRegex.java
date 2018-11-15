
package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* DAILY CODE DAY #28 
 * @HackerRank: Valid Username Regular Expression 
 * You are updating the username policy on your company's internal networking platform. 
 * According to the policy, a username is valid if the following constraints are satisfied:
 *  - The username consists of 8 to 30 characters inclusive
 *  - The username can only contain alphanumberic characters and underscores
 *  - The first character must be an alphabetic character
 * */
public class ValidateUsernameRegex {

	private static final String regex = "^[a-zA-Z][a-zA-Z0-9_.,$;]{6,30}+$";

	private static void validateInputContents(String[] usernames) {

		if (usernames.length == 0) {
			throw new NullPointerException("Array is null");
		}
		for (int i = 0; i < usernames.length; i++) {
			String s = usernames[i];
			matchUsernameWithRegex(s);
		}
	}

	public static void matchUsernameWithRegex(String s) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		if (m.find()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		String[] usernames = new String[] { "Julia", "Samantha", "Samantha", 
				"1Samantha", "Samantha?10_2A", "JuliaZ007",
				"Julia@007", "_Julia007" };

		validateInputContents(usernames);
	}
}




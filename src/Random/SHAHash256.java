
package Random;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;



/* DAILY CODE DAY #31 
 * Convert String to SHA-256 hash*/
public class SHAHash256 {

	private static void StringToHash(String input) {

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] data = md.digest(input.getBytes(StandardCharsets.UTF_8));
			bytesToHexValue(data);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void bytesToHexValue(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			String hexValue = Integer.toHexString(0xff & data[i]);
			if (hexValue.length() == 1) {
				sb.append('0');

			}
			sb.append(hexValue);
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		StringToHash(input);
	}
}






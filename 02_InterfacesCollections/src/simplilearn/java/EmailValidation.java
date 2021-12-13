package simplilearn.java;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<>();
		emails.add("abc@domain.co.in");
		emails.add("abc@domain.com");
		emails.add("ab-ax#@domain.co.in");
		emails.add("ab_cd@domain.com");
		emails.add("abCDxyz@domaincom");

		// Invalid list
		emails.add("@yahoo.com");
		emails.add("12abc#domain.com");

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);

		// Iterate emails array list
		for (String email : emails) {
			// Create instance of matcher
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " is a valid email address\n");
				continue;
			}
			System.out.println(email + " is an Invalid email address\n");
		}
	}
}

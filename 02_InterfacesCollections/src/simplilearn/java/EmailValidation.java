package simplilearn.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(pattern);

		boolean Invalid = true;
		while (Invalid) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your email_Id?");

			String email = sc.nextLine();
			Matcher m = p.matcher(email);
			if (m.matches()) {
				System.out.println("Great!! That is a valid email");
				Invalid = false;
			} else {
				System.out.println("Please provide a valid email address");
			}
		}
	}
}

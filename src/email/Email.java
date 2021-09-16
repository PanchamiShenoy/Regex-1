package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "@bridgelabz";
		String pattern = "@[a-zA-Z]+"; // regular expression for validating second mandatory part
		System.out.println(Pattern.matches(pattern, email));
	}
}

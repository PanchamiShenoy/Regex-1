package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = ".co";
		String pattern = "\\.[a-z]{2,4}";  // regular expression for validating third mandatory part
		System.out.println(Pattern.matches(pattern, email));
	}
}

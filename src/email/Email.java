package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "abc"; 
		String pattern = "[a-zA-Z]+"; 
		System.out.println(Pattern.matches(pattern,email));
	}
}

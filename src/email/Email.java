package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "abc.xyz@bridgelabz.com";
		String pattern = "^[a-zA-z0-9]+?(.)[a-zA-Z0-9+_.-]*@[a-zA-Z]+\\.[a-zA-z]{2,3}$"; 
		System.out.println(Pattern.matches(pattern, email));

	}
}

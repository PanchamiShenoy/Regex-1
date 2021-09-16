package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "abc.xyz@bridgelabz.co.in";
		String valid1 = "abc-100@yahoo.com";
		String valid2 = "abc.100@yahoo.com";
		String valid3 = "abc111@yahoo.com";
		String valid4 = "abc.100@abc.com.au";
		String invalid1 = "abc";
		String invalid2 = "abc@.com.my";
		String invalid3 = "abc123@gmail.a";
		String invalid4 = "abc123@.com.com";
		String invalid5 = ".abc@abc.com";
		String invalid6 = "abc()*@gmail.com";
		String invalid7 = "abc@%*.com";
		String invalid8 = "abc..2002@gmail.com";
		String invalid9 = "abc@gmail.com.aa.au";
		String pattern = "^[a-zA-z0-9]+?(.)[a-zA-Z0-9+_-]*@[a-zA-Z]+\\.[a-zA-z]{2,4}?(.)[A-za-z]*$";
		System.out.println(Pattern.matches(pattern, email));
		System.out.println(Pattern.matches(pattern, valid1));
		System.out.println(Pattern.matches(pattern, valid2));
		System.out.println(Pattern.matches(pattern, valid3));
		System.out.println(Pattern.matches(pattern, valid4));
		System.out.println(Pattern.matches(pattern, invalid1));
		System.out.println(Pattern.matches(pattern, invalid2));
		System.out.println(Pattern.matches(pattern, invalid3));
		System.out.println(Pattern.matches(pattern, invalid4));
		System.out.println(Pattern.matches(pattern, invalid5));
		System.out.println(Pattern.matches(pattern, invalid6));
		System.out.println(Pattern.matches(pattern, invalid7));
		System.out.println(Pattern.matches(pattern, invalid8));
		System.out.println(Pattern.matches(pattern, invalid9));

	}
}

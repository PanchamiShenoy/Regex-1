package email;

import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {

		String email = "abc.xyz@bridgelabz.co.in";
		String valid1 = "abc@yahoo.com";
		String valid2 = "abc-100@yahoo.com";
		String valid3 = "abc.100@yahoo.com";
		String valid4 = "abc111@yahoo.com";
		String valid5 = "abc.100@abc.com.au";
		String valid6 = "abc@1.com";
		String valid7 = "abc@gmail.com";
		String valid8 = "abc+100@gmail.com";
		String invalid1 = "abc";
		String invalid2 = "abc@.com.my";
		String invalid3 = "abc123@gmail.a";
		String invalid4= "abc123@.com";
		String invalid5 = "abc123@.com.com";
		String invalid6 = ".abc@abc.com";
		String invalid7 = "abc()*@gmail.com";
		String invalid8 = "abc@%*.com";
		String invalid9 = "abc..2002@gmail.com";
		String invalid10 = "abc.@gmail.com";
		String invalid11 = "abc@abc@gmail.com";
		String invalid12 = "abc@gmail.com.1a";
		String invalid13 = "abc@gmail.com.aa.au";
		String pattern = "^[a-zA-z0-9]+?(.)[a-zA-Z0-9+_-]+@(@)[a-zA-Z0-9]+\\.[a-zA-z]{2,4}?(.)[A-za-z]*$";
		System.out.println(Pattern.matches(pattern, email));
		System.out.println(Pattern.matches(pattern, valid1));
		System.out.println(Pattern.matches(pattern, valid2));
		System.out.println(Pattern.matches(pattern, valid3));
		System.out.println(Pattern.matches(pattern, valid4));
		System.out.println(Pattern.matches(pattern, valid5));
		System.out.println(Pattern.matches(pattern, valid6));
		System.out.println(Pattern.matches(pattern, valid7));
		System.out.println(Pattern.matches(pattern, valid8));
		System.out.println("****");
		System.out.println(Pattern.matches(pattern, invalid1));
		System.out.println(Pattern.matches(pattern, invalid2));
		System.out.println(Pattern.matches(pattern, invalid3));
		System.out.println(Pattern.matches(pattern, invalid4));
		System.out.println(Pattern.matches(pattern, invalid5));
		System.out.println(Pattern.matches(pattern, invalid6));
		System.out.println(Pattern.matches(pattern, invalid7));
		System.out.println(Pattern.matches(pattern, invalid8));
		System.out.println(Pattern.matches(pattern, invalid9));
		System.out.println(Pattern.matches(pattern, invalid10));
		System.out.println(Pattern.matches(pattern, invalid11));
		System.out.println(Pattern.matches(pattern, invalid12));
		System.out.println(Pattern.matches(pattern, invalid13));

	}
}

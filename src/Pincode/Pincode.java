package Pincode;

import java.util.regex.Pattern;

public class Pincode {

	public static void main(String[] args) {

		String pincode = "400088A"; // string to be validated
		String pattern = "[1-9]{1}[0-9]{5}$"; // regular expression
		System.out.println(Pattern.matches(pattern, pincode));
	}

}

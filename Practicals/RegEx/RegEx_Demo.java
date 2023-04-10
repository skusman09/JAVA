package io;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		boolean b=Pattern.matches("[a-zA-Z0-9]{5,}", "usman1234");
		System.out.println(b);
		boolean b1=Pattern.matches("[a-z0-9]", "gani");
		System.out.println(b1);
	}

}

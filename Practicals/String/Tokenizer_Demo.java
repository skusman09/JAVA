package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer s=new StringTokenizer("Welcome to Java class at Anudip","e");

		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}

	}

}
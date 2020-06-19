package com.seleniumprogram.pattrens;

import java.util.regex.*;

public class RegexExample2 {
	public static void main(String args[]) {
		String content = "This is a tutorial Website!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		MatchResult value=matcher.toMatchResult();		
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
	}
}


package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr6 {
	
	public static void main(String[] args) {
//		to consider the shortest match as a match we use ? wildcard.
		Pattern pat = Pattern.compile("e.+?d");
		Matcher mat = pat.matcher("extend cup end table");
		while(mat.find()) {
			System.out.println("Match: "+mat.group());
		}
	}
}
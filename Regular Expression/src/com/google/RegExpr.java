package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java");
		found = mat.matches();
		System.out.println("Testing Java against Java");
		if(found) System.out.println("Matches");
		else System.out.println("No match");
		
		mat = pat.matcher("Java 8");
		System.out.println("\nTesting Java against Java 8");
		found = mat.matches();
		if(found) System.out.println("Matches");
		else System.out.println("No match");
		/*
		 * the matches( ) function returns true only when the input sequence precisely
		 * matches the pattern. It will not return true just because a subsequence matches.
		 */
	}
}
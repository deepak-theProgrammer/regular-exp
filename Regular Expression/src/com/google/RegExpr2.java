package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {

	public static void main(String[] args) {
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Java");
		mat = pat.matcher("Java 8");
		found = mat.find();
		System.out.println("Looking for Java in Java 8");
		
		if(found) System.out.println("Subsequence found");
		else System.out.println("No match");
		
		/*
		 * find() determines if the input sequence contains a subsequence that matches the pattern
		 */
	}
}
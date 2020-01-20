/*
 * Write a program uses a wildcard to create a pattern that will match any sequence that
 * begins with e and ends with d.
 */
package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr5 {

	public static void main(String[] args) {
//		.(dot) represents a single character
		Pattern pat = Pattern.compile("e.+d");
		Matcher mat = pat.matcher("extend cup end table");
//		by default find() matches the longest sequence the fits the pattern
		while(mat.find()) {
			System.out.println("Match: "+mat.group());
		}
	}
}
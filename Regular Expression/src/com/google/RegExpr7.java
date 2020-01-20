package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr7 {

	public static void main(String[] args) {
//		by appending + after [a-z] we are creating a pattern which says its a match if the
//		word contains character between a to z.
//		if we don't append + it will consider a match after encountering each character which
//		is between a to z
		Pattern pat = Pattern.compile("[a-z]+");
		Matcher mat = pat.matcher("this is a test");
		while(mat.find()) {
			System.out.println("Match: "+mat.group());
		}
	}
}
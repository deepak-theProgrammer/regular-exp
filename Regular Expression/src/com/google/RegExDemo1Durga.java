/*
 * pattern: ab
 * String: ababbaba
 * Requirement: if ab is available, how many times it is available, where it
 * is available
 */
package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1Durga {

	public static void main(String[] args) {
		int count = 0;
//		we are searching for what? -> "ab"
		Pattern p = Pattern.compile("ab");	
		
//		where you want to search for the match of your pattern
		Matcher m = p.matcher("ababbaba");	
		
		while (m.find()) {
			System.out.println(m.start() + "..." + m.end() + "..." + m.group());
			count++;
		}
		System.out.println("The total number of occourence: "+count);
		/*
		 * start() -> start index of the match
		 * end() -> end index of the match
		 * group() -> which thing got matched, it returns the matched pattern
		 */
	}
}
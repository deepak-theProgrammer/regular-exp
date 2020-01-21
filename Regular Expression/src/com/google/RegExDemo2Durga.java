package com.google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2Durga {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a7b@2#9");
		System.out.println("For pattern [abc]");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
		System.out.println("\nFor pattern [^abc]");
		p = Pattern.compile("[^abc]");
		m = p.matcher("a7b@2#9");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
		System.out.println("\nFor pattern [a-z]");
		p = Pattern.compile("[a-z]");
		m = p.matcher("a7b@2#9");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
		System.out.println("\nFor pattern [0-9]");
		p = Pattern.compile("[0-9]");
		m = p.matcher("a7b@2#9");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
		System.out.println("\nFor pattern [a-zA-Z0-9]");
		p = Pattern.compile("[a-zA-Z0-9]");
		m = p.matcher("a7b@2#9");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
		System.out.println("\nFor pattern [^a-zA-Z0-9]");
		p = Pattern.compile("[^a-zA-Z0-9]");
		m = p.matcher("a7b@2#9");
		while (m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
	}
}
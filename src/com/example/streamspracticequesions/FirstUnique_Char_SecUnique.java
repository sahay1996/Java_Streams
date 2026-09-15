package com.example.streamspracticequesions;

import java.util.List;
import java.util.stream.Collectors;

public class FirstUnique_Char_SecUnique {

	public static void main(String[] args) {
		String str = "abcdeabde";
		List<Character> filterd = str.chars().mapToObj(s -> (char) s).filter(s -> str.indexOf(s) == str.lastIndexOf(s))
				.collect(Collectors.toList());
		System.out.println("Filtered List : "+filterd);
		String str1 = "bombay";
		List<Character> st = str1.chars().mapToObj(s -> (char) s).filter(w -> str.indexOf(w) == str.lastIndexOf(w))
				.collect(Collectors.toList());
		System.out.println("Unqiue Characters : "+st);
	}

}

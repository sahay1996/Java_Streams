package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;

public class LongestStrings {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashish", "Rahul", "Priya", "Amit", "Sneha", "Vikram", "Neha", "Rohit",
				"Ankit", "Pooja", "Karan", "Meena", "Arjun", "Vivek", "Riya", "Suresh", "Kavya", "Nisha", "Manoj",
				"Rahul", "Ashish", "Priya", "Amit", "abcdefghijklmnopqrstuvwxyz", "Arjun", "Rohit", "Neha", "Karan",
				"Sneha", "Vikram", "Pooja");
		int getNames = names.stream().distinct().mapToInt(String::length).max().orElse(0);
		int lengths = names.stream().distinct().mapToInt(String::length).max().orElse(0);
		int len1 = names.stream().distinct().mapToInt(String::length).max().orElse(0);
		int len2 = names.stream().distinct().mapToInt(String::length).max().orElse(0);
		System.out.println(getNames +" "+lengths+" "+len1+" "+len2);

	}

}

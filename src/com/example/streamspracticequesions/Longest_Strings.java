package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Longest_Strings {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "level", "orange", "madam", "java", "spring", "radar",
				"python", "apple", "hello", "world", "civic", "banana", "programming", "kayak", "developer", "level",
				"backend", "refer","abcdefghijklmnopqrstuvwxyz");
		Optional<String> str = words.stream().sorted((a,b)->b.length()-a.length()).findFirst();
		System.out.println(str.get());
	}

}

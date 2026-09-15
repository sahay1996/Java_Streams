package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindromic_Strings {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "hello", "level", "world", "radar", "java", "civic", "apple",
				"racecar", "stream", "refer", "coding", "noon", "banana", "rotor", "spring", "kayak", "developer",
				"malayalam", "computer", "madam", "hello", "level", "java", "radar");
		List<String> reversedWords = words.stream().distinct()
				.filter(w -> w.equals(new StringBuilder(w).reverse().toString())).collect(Collectors.toList());
		System.out.println("Palindromic Strings : " + reversedWords);
		long countPalindromicWords = words.stream().filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
				.count();
		System.out.println("Count of palindromic words are : " + countPalindromicWords);
		long countPalindromicWords1 = words.stream().distinct()
				.filter(w -> w.equals(new StringBuilder(w).reverse().toString())).count();
		System.out.println("Count Palindromic Words :" + countPalindromicWords1);
		words.stream().distinct().filter(w -> w.equals(new StringBuilder(w).reverse().toString()))
				.forEach(w -> System.out.println("Palindromic Strings are : "+w));
		//Length of longest strings
		System.out.println(Thread.currentThread().getName());
	}

}

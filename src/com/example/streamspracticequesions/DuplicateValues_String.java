package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValues_String {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashish",
				"Rahul", "Priya", "Amit", "Sneha", "Vikram", "Neha", "Rohit",
				"Ankit", "Pooja", "Rahul", "Ashish", "Karan", "Meena", "Arjun", "Sneha", "Vivek", "Riya", "Amit",
				"Suresh", "Kavya", "Rohit", "Nisha", "Arjun", "Manoj");
		Set<String> set = new HashSet<>();
		List<String> duplicateValues = names.stream().filter(w->!set.add(w)).collect(Collectors.toList());
		System.out.println("Duplicate Values are : "+duplicateValues);
	}

}

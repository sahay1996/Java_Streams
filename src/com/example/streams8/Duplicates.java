package com.example.streams8;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class Duplicates {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rahul", "Amit", "Priya", "Rahul", "Sneha", "Amit", "Vikram", "Priya");
		Set<String> set = new HashSet<>();
		List<String> duplicateElements = names.stream().filter(w->!set.add(w)).collect(Collectors.toList());
		System.out.println(duplicateElements);
	}

}

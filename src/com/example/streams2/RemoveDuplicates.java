package com.example.streams2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(99, 67, 44, 33, 555, 98, 67, 44);
		Set<Integer> sets = new HashSet<>();
		List<Integer> removeduplicateElements = numbers.stream().filter(w->sets.add(w)).collect(Collectors.toList());
		System.out.println("Removed Duplicate Elements are : "+removeduplicateElements);
	}
}

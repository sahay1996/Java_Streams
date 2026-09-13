package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Freq_By_Name {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashish", "Rahul", "Priya", "Amit", "Sneha", "Vikram", "Neha", "Rohit",
				"Ankit", "Pooja", "Rahul", "Ashish", "Karan", "Meena", "Arjun", "Sneha", "Vivek", "Riya", "Amit",
				"Suresh", "Kavya", "Rohit", "Nisha", "Arjun", "Manoj");
		Map<Object, Long> freq_By_Name = names.stream().distinct().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(freq_By_Name);
		Map<Object, Long> freq= names.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
	}

}

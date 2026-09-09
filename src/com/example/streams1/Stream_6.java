package com.example.streams1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_6 {
	// To Obtain Duplicates
	public static void main(String[] args) {
		List<List<String>> cities = (Arrays.asList(Arrays.asList("Delhi", "Noida", "Gurgaon"), // North
				Arrays.asList("Mumbai", "Pune", "Nagpur"), // West
				Arrays.asList("Bengaluru", "Mysuru", "Mangaluru", "Mumbai", "Pune", "Nagpur")));
		Set<String> set = new HashSet<>();
		List<String> processedCites = cities.stream().flatMap(w -> w.stream()).filter(w -> !set.add(w))
				.collect(Collectors.toList());
		System.out.println("Processed Cities are : " + processedCites);
	}
}

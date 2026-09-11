package com.example.streams8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("CHE", "AHM", "BLR", "NOI", "GGN", "DEL", "CHE", "AHM", "BLR", "PNBE");
		//distinct Elements
		List<String> distinctElements = (List<String>) cities.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Elements are : " + distinctElements);
		distinctElements.forEach(w -> System.out.println(w));
		// find first element
		distinctElements.stream().filter(c -> c.startsWith("C")).limit(1)
				.forEach(w -> System.out.println("Distinct elements starts with C is :" + w));
		//Sort the elements
		distinctElements.stream().sorted().forEach(w->System.out.print(" Sorted Elements are : "+w));
		//skip
		distinctElements.stream().skip(1).forEach(city->System.out.println("Starting City skipped :"+city));
	}

}

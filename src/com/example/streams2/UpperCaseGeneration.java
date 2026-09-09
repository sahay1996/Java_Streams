package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseGeneration {

	public static void main(String[] args) {
		List<List<String>> cities = (Arrays.asList(Arrays.asList("Delhi", "Noida", "Gurgaon"),
				Arrays.asList("Mumbai", "Pune", "Nagpur"), // West
				Arrays.asList("Bengaluru", "Mysuru", "Mangaluru", "Mumbai", "Pune", "Nagpur")));
		List<String> processedCities = cities.stream().flatMap(w->w.stream()).map(w->w.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper Case for the cities are : \n"+processedCities);
	}

}

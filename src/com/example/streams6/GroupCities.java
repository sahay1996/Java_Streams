package com.example.streams6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCities {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "PUNE", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");
		Map<Boolean, List<String>>   processedCities = cities.stream().collect(Collectors.groupingBy(w->w.length()>6));
		System.out.println("Processed cities are : "+processedCities);
	}

}

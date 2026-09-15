package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Counting_Grouping {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Chennai", "Delhi", "Pune", "Hyderabad", "Kolkata");
		long totalCities = cities.stream().collect(Collectors.counting());
		System.out.println(totalCities);
		Map<Object, List<String>> groupBy = cities.stream().collect(Collectors.groupingBy(city->city.length()));
		System.out.println(groupBy);
		Map<Object, Long> value = cities.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
		System.out.println(value);
	}

}

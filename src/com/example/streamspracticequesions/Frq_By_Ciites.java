package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frq_By_Ciites {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Chennai",  "Delhi", "Pune",
				"Hyderabad",  "Kolkata");
		Map<Object, Long> filteredCities =  cities.stream().distinct().collect(Collectors.groupingBy(w->w,Collectors.counting()));
		System.out.println(filteredCities);
	}

}

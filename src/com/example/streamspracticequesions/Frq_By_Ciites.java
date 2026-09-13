package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frq_By_Ciites {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Chennai", "Bangalore", "Delhi", "Pune", "Mumbai",
				"Hyderabad", "Bangalore", "Chennai", "Pune", "Delhi", "Mumbai", "Bangalore", "Kolkata", "Chennai",
				"Hyderabad", "Pune", "Bangalore", "Mumbai", "Delhi", "Chennai", "Bangalore", "Pune", "Hyderabad");
		Map<String, Long> citiesFreq = 	cities.stream().collect(Collectors.groupingBy(city->city,Collectors.counting()));
		System.out.println("Cities Frequency = : "+citiesFreq);
		
	}

}

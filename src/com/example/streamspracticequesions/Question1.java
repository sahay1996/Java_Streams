package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Delhi", "Chennai", "Hyderabad", "Pune", "Kolkata",
				"Jaipur", "Ahmedabad", "Lucknow", "Bangalore", "Mysore", "Chennai", "Surat", "Bhopal", "Patna", "Delhi",
				"Kochi", "Indore", "Nagpur", "Pune", "Noida", "Gurgaon", "Mumbai", "Chandigarh", "Mysore", "Hyderabad",
				"Kanpur", "Agra", "Varanasi");
		Set<String> set = new HashSet<>();
		List<String> result = cities.stream().filter(w -> !set.add(w)).collect(Collectors.toList());
		System.out.println("Resultant String is : "+result);
	}

}

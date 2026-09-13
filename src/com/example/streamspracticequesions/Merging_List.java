package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merging_List {

	public static void main(String[] args) {
		List<String> states = Arrays.asList("Karnataka", "Maharashtra", "Tamil Nadu", "Kerala", "Gujarat", "Rajasthan",
				"Punjab", "Haryana", "West Bengal", "Bihar", "Odisha", "Assam", "Telangana", "Andhra Pradesh",
				"Uttar Pradesh");
		List<String> capitals = Arrays.asList("Bengaluru", "Mumbai", "Chennai", "Thiruvananthapuram", "Gandhinagar",
				"Jaipur", "Chandigarh", "Chandigarh", "Kolkata", "Patna", "Bhubaneswar", "Dispur", "Hyderabad",
				"Amaravati", "Lucknow");
		List<String> mergedList = Stream.concat(states.stream(), capitals.stream()).collect(Collectors.toList());
		System.out.println(mergedList);
		
		
	}

}

package com.example.streams10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_len_Strings {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Delhi", "Chennai", "Hyderabad", "Pune", "Kolkata",
				"Jaipur", "Ahmedabad", "Lucknow", "Bangalore", "Mysore", "Chennai", "Surat", "Bhopal", "Patna", "Delhi",
				"Kochi", "Indore", "Nagpur", "Pune", "Noida", "Gurgaon", "Mumbai", "Chandigarh", "Mysore", "Hyderabad",
				"Kanpur", "Agra", "Varanasi");
		Map<Integer, List<String>> citiesMap = cities.stream().distinct().filter(w->w.length()>6).collect(Collectors.groupingBy(c -> c.length()));
		Map<Boolean,List<String>>result = cities.stream().distinct().collect(Collectors.partitioningBy(c->c.length()>6));
		System.out.println(citiesMap);
		System.out.println(result);
	}

}

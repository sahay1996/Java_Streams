package com.example.streams1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_5 {

	public static void main(String[] args) {
		List<List<String>> cities = Arrays.asList(Arrays.asList("New Delhi", "Mumbai", "Kolkata"),
				Arrays.asList("Surat", "Lucknow", "Agra","Mumbai"), Arrays.asList("Ahmedabad", "Pune", "Jaipur"),
				Arrays.asList("Surat", "Lucknow", "Agra","Mumbai"));
		System.out.println(cities);
		Set<String> citiesSet = new HashSet<>();
		List<String> flats = cities.stream().flatMap(w->w.stream()).filter(w->!citiesSet.add(w)).collect(Collectors.toList());
		System.out.println(flats);
		
				
		
		

	}

}

package com.example.streams10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepatingCharacter {

	public static void main(String[] args) {
		String word = "swiss";
		Optional<Character> output = word.chars().mapToObj(c -> (char) c)
				.filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();
		System.out.println(output.get());
		//
		String name = "Ashish";
		Optional<Character> output1 = name.chars().mapToObj(c -> (char) c)
				.filter(ch -> name.indexOf(ch) == name.lastIndexOf(ch)).findFirst();
		System.out.println(output1.get());
		//
		String naam = "aasshhisssh";
		Optional<Character> output2 = naam.chars().mapToObj(c -> (char) c)
				.filter(ch -> naam.indexOf(ch) == naam.lastIndexOf(ch)).findFirst();
		System.out.println(output2.get());
		//
		String firstName = "aasshhpiiisssh";
		Optional<Character> output3 = firstName.chars().mapToObj(ch -> (char) ch)
				.filter(ch -> firstName.indexOf(ch) == firstName.lastIndexOf(ch)).findFirst();
		System.out.println(output3.get());
		//
		String lastName = "Kumkuumar";
		Optional<Character> output4 = lastName.chars().mapToObj(ch -> (char) ch)
				.filter(ch -> lastName.indexOf(ch) == lastName.lastIndexOf(ch)).findFirst();
		System.out.println(output4.get());
		List<String> cities = Arrays.asList("Bangalore", "Mumbai", "Delhi", "Chennai", "Hyderabad", "Pune", "Kolkata",
				"Jaipur", "Ahmedabad", "Lucknow", "Bangalore", "Mysore", "Chennai", "Surat", "Bhopal", "Patna", "Delhi",
				"Kochi", "Indore", "Nagpur", "Pune", "Noida", "Gurgaon", "Mumbai", "Chandigarh", "Mysore", "Hyderabad",
				"Kanpur", "Agra", "Varanasi");
		Map<Integer, List<String>> proceesedCities = cities.stream().collect(Collectors.groupingBy(c->c.length()));
		System.out.println("Processed Cities are : "+proceesedCities.toString());
		Map<Object, List<String>> citiesLengthGreater6  = cities.stream().collect(Collectors.groupingBy(c->c.length()>6));
		System.out.println(citiesLengthGreater6);
	}

}

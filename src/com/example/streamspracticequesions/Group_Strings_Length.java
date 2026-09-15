package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Strings_Length {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashish", "Rahul", "Priya", "Amit", "Sneha", "Vikram", "Neha", "Rohit",
				"Ankit", "Pooja", "Rahul", "Ashish", "Karan", "Meena", "Arjun", "Sneha", "Vivek", "Riya", "Amit",
				"Suresh", "Kavya", "Rohit", "Nisha", "Arjun", "Manoj");
	Map<Object, List<String>> string_By_Length = 	names.stream().distinct().collect(Collectors.groupingBy(w->w.length()));
	System.out.println(string_By_Length);
	}

}

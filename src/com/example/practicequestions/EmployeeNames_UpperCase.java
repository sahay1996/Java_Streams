package com.example.practicequestions;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNames_UpperCase {

	public static void main(String[] args) {
		List<String> employeeNames = Arrays.asList("Ashish", "Rahul", "Priya", "Sneha", "Arjun", "Vikram", "Neha",
				"Kiran", "Rohit", "Anjali", "Suresh", "Pooja", "Amit", "Divya", "Manoj");
		List<String> upperCase = employeeNames.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
		System.out.println("Uppar Case : " + upperCase);
	}

}

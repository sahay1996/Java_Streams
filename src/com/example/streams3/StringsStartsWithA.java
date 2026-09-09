package com.example.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ashish", "Rahul", "Amit", "John", "Anil", "David");
		
		List<String> startsWithA = names.stream().filter(w->w.startsWith("A")).collect(Collectors.toList());
		System.out.println("List Starts with A  : "+startsWithA);
	}

}

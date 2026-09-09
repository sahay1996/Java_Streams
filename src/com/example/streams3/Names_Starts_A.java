package com.example.streams3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Names_Starts_A {

	public static void main(String[] args) {
		List<String> names =
			    Arrays.asList("Ashish", "Rahul", "Amit", "John", "Anil");
		List<String> counter = names.stream().filter(w->w.startsWith("A")).collect(Collectors.toList());
		System.out.println(counter.size());
		
	}

}

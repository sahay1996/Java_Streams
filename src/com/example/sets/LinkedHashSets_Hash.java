package com.example.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets_Hash {

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		cities.add("BLR");
		cities.add("HYD");
		cities.add("PUNE");
		cities.add("CHE");
		cities.add("PNBE");
		cities.add("DEL");
		
		System.out.println("Displaying the cities as follows : "+cities);
	}

}

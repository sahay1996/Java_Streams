package com.example.streams7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<List<String>> cities = Arrays.asList( Arrays.asList("BLR","BOMBAY"), Arrays.asList("HYD","PUNE"), Arrays.asList("CHE","PNBE"));
		System.out.println("2d Structre is : "+cities);
		List<String> processedCities = cities.stream().flatMap(w->w.stream()).filter(w->w.startsWith("B")).map(w->w.toUpperCase()).collect(Collectors.toList());
		System.out.println("Processed Cities are : "+processedCities);
	}

}

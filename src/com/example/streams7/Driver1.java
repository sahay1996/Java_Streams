package com.example.streams7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1 {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("BLR","BOMBAY","HYD","PUNE","CHE","PNBE");
		Stream<String> inputStream = cities.stream();
		Stream<String> filteredStream = inputStream.filter(w->w.startsWith("B"));
		List<String> finalList = filteredStream.collect(Collectors.toList());
		System.out.println("Final List is : "+finalList);
	}

}

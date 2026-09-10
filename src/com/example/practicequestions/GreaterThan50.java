package com.example.practicequestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan50 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(51, 55, 6, 5, 0, 75, 80, 85, 90, 95, 10, 105, 110, 120, 125);
		List<Integer> processedList = numbers.stream().filter(n->n>50).collect(Collectors.toList());
		System.out.println("Processed List is : "+processedList);
	}

}

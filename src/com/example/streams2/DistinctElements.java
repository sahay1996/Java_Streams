package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(19,198,1516,3365,55,19,1987,198);
		List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Numbers are : "+distinctNumbers);
	}
}

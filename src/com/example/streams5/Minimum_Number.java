package com.example.streams5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Minimum_Number {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		Optional<Integer> min = numbers.stream().min((a, b) -> a - b);
		System.out.println("Minimum Number in the list is : " +min.get());
	}

}

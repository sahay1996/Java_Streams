package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstHighest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(100000, 20000, 9999, 55, 54444, Integer.MAX_VALUE);
		Optional<Integer> optional = numbers.stream().distinct().sorted((a, b) -> b - a).findFirst();
		System.out.println("Highest Number is : " + optional.get());
	}

}

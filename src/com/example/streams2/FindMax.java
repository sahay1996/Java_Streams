package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(99, 67, 44, 33, 555, 98,67,44);
		Optional<Integer> maximum = numbers.stream().max((a,b)->a-b);
		System.out.println(maximum.get());
	}
}

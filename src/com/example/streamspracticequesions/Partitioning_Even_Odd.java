package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning_Even_Odd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 7, 24, 15, 8, 33, 42, 19, 56, 21, 10, 5, 64, 27, 38, 11, 72, 9, 46,
				31);
		Map<Boolean, List<Integer>> even_odd = numbers.stream().collect(Collectors.partitioningBy(w -> w % 2 == 0));
		System.out.println(even_odd);
	}

}

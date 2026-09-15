package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Freq_By_Numbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30, 20, 50, 40, 30, 10, 60, 50, 40, 20, 10);
		Map<Object, Long> freq_Numbers = numbers.stream()
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(freq_Numbers);
	}

}

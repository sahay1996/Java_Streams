package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square_Lists {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, -5, 7, 24, 15, -8, 3, 42, 19, -11, 30, 2, 25, -4, 18, 9, 13, -7, 50,
				21, 5, -2, 16, 29, 10, -15, 37, 22, 8, -3, 11, 40, 17, 6, 27, 7, -5, 12, 19, 2);

		numbers.stream().map(n -> n * n).distinct() .collect(Collectors.toList()).forEach(w -> System.out.println(w));
	}

}

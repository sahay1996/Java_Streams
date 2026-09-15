package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecSmallest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 7, 25, 4, 18, 33, 10, 5, 42, 19, 8, 27, 15, 50, 3, 22, 9, 36, 11, 14,
				29, 6, 45, 20, 17, 30, 13, 24, 2, 39, 7, 18, 25, 10, 42, 5, 33, 12, 19, 8);
		numbers.stream().distinct(). sorted().collect(Collectors.toList()).forEach(n->System.out.print(n+" "));
		System.out.println();
		Optional<Integer> value = numbers.stream().distinct().sorted().skip(1).findFirst();
		System.out.println(value.get());
	}

}

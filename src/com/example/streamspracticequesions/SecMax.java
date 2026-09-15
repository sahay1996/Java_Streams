package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 7, 42, 18, 33, 5, 64, 21, 90, 12, 37, 8, 55, 16, 29, 44, 3, 72,
				11, 50, 19, 6, 81, 24, 35, 2, 68, 15, 100, 9, 47, 30, 13, 56, 22, 75, 4, 39, 60, 17, 27, 88, 14, 31, 52,
				20, 7, 25, 42, 10, 18);
		List<Integer> secMax = numbers.stream().distinct().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(secMax);
		numbers.stream().distinct().sorted((a,b)->b-a).limit(2).skip(1).forEach(w->System.out.println(w));
	}

}

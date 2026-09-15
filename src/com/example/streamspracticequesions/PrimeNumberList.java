package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 27, 29, 30, 31, 32, 33, 35, 37, 40, 41, 42, 43, 45, 47, 50, 51, 53, 55, 57, 59, 60,
				63, 67, 70);
		List<Integer> primeNumberList = numbers.stream().filter(n -> CheckPrimeNumber.isPrime(n))
				.collect(Collectors.toList());
		System.out.println("Prime Number List : "+primeNumberList);
	}

}

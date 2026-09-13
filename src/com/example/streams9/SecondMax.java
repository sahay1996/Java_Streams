package com.example.streams9;

import java.util.Arrays;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, 20, 30, 20, 40,
			    50, 10, 60, 30, 70
			);
		List<Integer> sortedNumbers = numbers.stream().sorted((a,b)->b-a).toList();
		System.out.println("Sorted List is : "+sortedNumbers);
		int secMax = numbers.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get();
		System.out.println("Second Maximum Number is : "+secMax);
	}

}

package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(10000,11000,12000,9000,50000,5000,3000,10000);
		Optional<Integer> optional = salaries.stream().distinct().sorted((a,b)->a-b).skip(0).findFirst();
		System.out.println("Second Highest Element is : "+optional.get());
	}

}

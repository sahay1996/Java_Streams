package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumallNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91);
		int sum = numbers.stream().filter(n->n%2==0).reduce(0, (a,b)->a+b);
		System.out.println("Sum of all the numbers are : "+sum);

	}

}

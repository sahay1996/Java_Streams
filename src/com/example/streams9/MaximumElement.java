package com.example.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Optional<Integer> max = numbers.stream().sorted((a,b)->b-a).findFirst();
		System.out.println("Max number in the list is : "+max.get());
	}

}

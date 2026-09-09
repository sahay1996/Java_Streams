package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMin {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 99, 67, 44, 33, 555, 98, 67, 44);
		Optional<Integer> min = numbers.stream().min((a,b)->a-b);
		System.out.println(min.get());
	}

}

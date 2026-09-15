package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;

public class Summiation {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer value1 = numbers.stream().reduce((a, b) -> a + b).get();
		System.out.println(value1);
	}


}

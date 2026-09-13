package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question5_Find_Freq {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30, 50, 20, 60, 10, 40, 30, 20, 70, 50, 10,
				60, 30, 20, 80, 40, 10, 50);
		Map<Object, Long> frequency =  numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
		System.out.println(frequency);
		
		
	}

}

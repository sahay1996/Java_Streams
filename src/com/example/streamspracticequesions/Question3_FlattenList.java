package com.example.streamspracticequesions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question3_FlattenList {

	public static void main(String[] args) {
		List<List<Integer>> numbers = new ArrayList<>();
		numbers.add(Arrays.asList(10, 20, 30));
		numbers.add(Arrays.asList(40, 50, 60));
		numbers.add(Arrays.asList(70, 80, 90));
		numbers.add(Arrays.asList(100, 110, 120));
		List<Integer> result = numbers.stream().flatMap(w->w.stream()).collect(Collectors.toList());
		System.out.println(result);
	}

}

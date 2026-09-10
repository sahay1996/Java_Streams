package com.example.streams7;

import java.util.*;
import java.util.stream.Collectors;

public class TwoDimension_OneDimension {

	public static void main(String[] args) {
		// [[3], [366, 3, 4, 22, 1000, 6, 576], [3, 84], [83, 6684, 776], [8, 9, 10,
		// 11]]
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(3), Arrays.asList(366, 3, 4, 22, 1000, 6, 576),
				Arrays.asList(3, 84), Arrays.asList(83, 6684, 776));
		System.out.println("2 Dimensional Arrays is : "+numbers);
		List<Integer> result = numbers.stream().flatMap(n->n.stream()).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("Result is : "+result);

	}

}

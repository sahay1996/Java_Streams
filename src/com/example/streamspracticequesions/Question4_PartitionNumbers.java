package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4_PartitionNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 7, 24, 15, 8, 33, 42, 19, 6, 27, 50, 11, 4, 35, 18, 9, 26, 21, 14, 31,
				40, 5, 16, 29, 10, 37, 22, 13, 28, 7, 12, 19, 44, 15, 6);
		Map<Boolean, List<Integer>> partitioned_Odd_Even = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println("Partitioned Odd and Even are : "+partitioned_Odd_Even);
	}

}

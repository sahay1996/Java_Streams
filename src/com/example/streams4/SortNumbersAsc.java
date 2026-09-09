package com.example.streams4;
import java.util.*;
import java.util.stream.Collectors;
public class SortNumbersAsc {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(50, 10, 40, 20, 30);
		List<Integer> sorting = numbers.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(sorting);
	}

}

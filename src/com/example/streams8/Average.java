package com.example.streams8;

import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(99,78,66,55,28);
		int avg = (numbers.stream().reduce(0, (a,b)->a+b))/numbers.size();
		System.out.println("Avg of the list is : "+avg);
	}

}

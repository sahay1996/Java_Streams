package com.example.streamspracticequesions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maximum_In_List {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 7, 24, 15, 8, 33, 42, 19, 6, 27, 50, 11, 4, 35, 18, 9, 26, 21, 14, 31,
				40, 5, 16, 29, 10, 37, 22, 13, 28, 7, 12, 19, 44, 15, 6, 25, 32, 17, 20, 9);
		int value =  numbers.stream().max(Integer::compare).get();
		System.out.println("Value is :" +value);
	}

}

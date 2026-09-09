package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(99, 67, 44, 33, 555, 98, 67, 44);
		numbers.stream().sorted((a,b)->(b-a)).forEach(w->System.out.println(w));
	}
}

package com.example.streams3;
import java.util.*;
import java.util.stream.Collectors;
public class SquareNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);
		List<Integer> results = numbers.stream().map(w->w*w).collect(Collectors.toList());
		System.out.println("Results are  : "+results);
	}

}

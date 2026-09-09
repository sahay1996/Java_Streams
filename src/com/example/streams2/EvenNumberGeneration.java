package com.example.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberGeneration {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(19,18,6666,67,87,56);
		List<Integer> evenNumbers = numbers.stream().filter(w->w%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers are : "+evenNumbers);
	}

}

package com.example.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		List<Integer> evenNumbers = numbers.stream().filter(w->w%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers are : "+evenNumbers);
	}
}

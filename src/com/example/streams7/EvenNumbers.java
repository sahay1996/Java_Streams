package com.example.streams7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,23,40,70,45,67,84);
		List<Integer> evenNumbers = numbers.stream().filter(w->w%2==0).collect(Collectors.toList());
		System.out.println("Evene Numbers are : "+evenNumbers);
		List<Integer> multiplyBy10 = evenNumbers.stream().map(n->n*10).collect(Collectors.toList());
		System.out.println("Multipled by 10 : "+multiplyBy10);
	}

}

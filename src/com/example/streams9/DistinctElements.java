package com.example.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(4,4,4,5,5,6,90,11,23);
		input.stream().distinct().forEach(w->System.out.println(w));
		List<Integer> skippedElements = input.stream().skip(2).map(w->w*10).collect(Collectors.toList());
		int firstElement = skippedElements.stream().findFirst().get();
		System.out.println(skippedElements+" "+firstElement);
	
	}

}

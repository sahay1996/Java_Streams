package com.example.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,30,40,50);
		List<Integer> list2 = Arrays.asList(60,70,80,90,100,10);
		List<Integer> finalList = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
		System.out.println("Merged List : "+finalList);
		int sum = finalList.stream().reduce(0, (a,b)->a+b)/finalList.size();
		System.out.println("Sum of the list is : "+sum);
		
	}

}

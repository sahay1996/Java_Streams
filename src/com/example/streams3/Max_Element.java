package com.example.streams3;
import java.util.*;
public class Max_Element {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		Optional<Integer> maxElement = numbers.stream().max((a,b)->a-b);
		System.out.println("Optional Max is :"+maxElement.get());
	}

}

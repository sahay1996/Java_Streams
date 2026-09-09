package com.example.streams5;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(11, 13, 17, 20, 22, 30);
		Optional<Integer> result = numbers.stream().reduce((a,b)->a+b);
		System.out.println(result.get());
	}

}

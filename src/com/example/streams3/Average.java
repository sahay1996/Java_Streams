package com.example.streams3;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		int sum = numbers.stream().reduce(0, (a,b)->a+b);
		double avg = sum/numbers.size();
		System.out.println("Average of the list is : "+avg);
	}

}

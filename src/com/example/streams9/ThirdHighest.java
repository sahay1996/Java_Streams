package com.example.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(
			    10, -5, 7, 12, -8,
			    3, 25, -11, 18, 2,
			    -4, 15, 9, -7, 20,
			    13, -2, 30, 5, 17,
			    -15, 22, 8, -3, 11,
			    40, -10, 19, 6, 21,
			    7, -5, 2, 13, 10
			);
		List<Integer> sortedList = numbers.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		int thirdEvenHighest = sortedList.stream().distinct().filter(n->n%2==0).sorted((a,b)->b-a).skip(2).findFirst().get();
		System.out.println("Sorted List are :"+sortedList);
		System.out.println("Third Highest Number is : "+thirdEvenHighest);
		//Sum all the numbers
		int sumOfList = sortedList.stream().reduce(0, (a,b)->{
			return a+b;
		}).intValue();
		System.out.println(sumOfList);
		//find minimum
		int minimum = numbers.stream().sorted().findFirst().get();
		System.out.println(minimum);
	}

}

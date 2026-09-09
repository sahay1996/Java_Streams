package com.example.streams5;

import java.util.Arrays;
import java.util.List;

public class Sum_All_Numbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);//40 35 30 25 20 15 10
		int sum = numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum of the list is : "+sum);

	}

}

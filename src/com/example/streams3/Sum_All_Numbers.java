package com.example.streams3;
import java.util.*;
public class Sum_All_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers =
			    Arrays.asList(100, 99, 98, 97, 96);
		int sumAll = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum of the numbers are : "+sumAll);
	}

}

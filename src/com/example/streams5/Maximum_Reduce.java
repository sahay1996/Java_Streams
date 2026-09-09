package com.example.streams5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maximum_Reduce {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 20, 30, 40, 50);
		int maximum_Among_List = numbers.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println("Maximum among list is : "+maximum_Among_List);
	}

}

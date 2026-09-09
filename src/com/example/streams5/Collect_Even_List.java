package com.example.streams5;
import java.util.*;
import java.util.stream.Collectors;
public class Collect_Even_List {

	public static void main(String[] args) {
		List<Integer> numbers =
			    Arrays.asList(10, 20, 10, 30, 20, 40);
		List<Integer> evenList = numbers.stream().distinct().filter(w->w%2==0).collect(Collectors.toList());
		System.out.println("Even List are : "+evenList);
	}

}
